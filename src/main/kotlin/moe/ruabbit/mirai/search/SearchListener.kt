package moe.ruabbit.mirai.search

import io.ktor.util.*
import moe.ruabbit.mirai.config.CommandConfig
import moe.ruabbit.mirai.data.SetuData
import net.mamoe.mirai.event.GlobalEventChannel
import net.mamoe.mirai.event.subscribeGroupMessages
import net.mamoe.mirai.message.data.Image
import net.mamoe.mirai.message.data.MessageSource.Key.quote
import net.mamoe.mirai.message.data.time
import net.mamoe.mirai.message.nextMessage

@KtorExperimentalAPI
fun searchListenerRegister() {
    GlobalEventChannel.subscribeGroupMessages {
        always {
            if (message.contentToString().startsWith(CommandConfig.searchByImage)) {
                if (SetuData.groupPolicy[group.id] == null) {
                    subject.sendMessage(message.quote() + "本群没有开启插件!")
                }
                val sauceNao = SauceNaoRequester(subject)
                val image = message[Image]
                if (image == null) {
                    subject.sendMessage(message.quote() + "没有图片的说,请在60s内发送图片")
                    val nextMsg = nextMessage()
                    //判断发送的时间
                    if (nextMsg.time - time < 60) {
                        val nextImage = nextMsg[Image]
                        if (nextImage == null) {
                            subject.sendMessage(nextMsg.quote() + "没有获取图片")
                        } else {
                            sauceNao.search(nextImage)
                            sauceNao.sendResult(nextMsg)
                        }
                    }
                } else {
                    sauceNao.search(image)
                    sauceNao.sendResult(message)
                }

            }
        }
    }
}


private fun String.startsWith(sauceNao: MutableList<String>): Boolean {
    sauceNao.forEach {
        if (this.startsWith(it))
            return true
    }
    return false
}
