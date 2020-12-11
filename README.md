<div align="center">
   <img width="160" src="http://img.mamoe.net/2020/02/16/a759783b42f72.png" alt="logo"></br>


   <img width="95" src="http://img.mamoe.net/2020/02/16/c4aece361224d.png" alt="title">

----
Mirai 是一个在全平台下运行，提供 QQ 协议支持的高效率机器人库

这个项目的名字来源于
     <p><a href = "http://www.kyotoanimation.co.jp/">京都动画</a>作品<a href = "https://zh.moegirl.org/zh-hans/%E5%A2%83%E7%95%8C%E7%9A%84%E5%BD%BC%E6%96%B9">《境界的彼方》</a>的<a href = "https://zh.moegirl.org/zh-hans/%E6%A0%97%E5%B1%B1%E6%9C%AA%E6%9D%A5">栗山未来(Kuriyama <b>Mirai</b>)</a></p>
     <p><a href = "https://www.crypton.co.jp/">CRYPTON</a>以<a href = "https://www.crypton.co.jp/miku_eng">初音未来</a>为代表的创作与活动<a href = "https://magicalmirai.com/2019/index_en.html">(Magical <b>Mirai</b>)</a></p>
图标以及形象由画师<a href = "">DazeCake</a>绘制
</div>

# mirai-setu
一个使用[loliconAPI](https://api.lolicon.app/#/setu) 的[mirai-console](https://github.com/mamoe/mirai-console) 的色图插件

# 声明
本插件为开发学习用，请勿用于非法用途。部分搜索的图片可能会引发不适，甚至导致账号封禁以及群封禁，请谨慎使用。作者本人不承担任何责任。

本插件遵循mirai软件AGPLv3协议开源，不参与一切商业活动。

由于作者学业压力较大，不能保证插件的及时更新以及bug修复。

插件暂时停更，作者需要考研。月底恢复
## 使用说明
1. 环境配置
    - 插件开发环境为mirai-console-1.0.0版本，其他版本的[mirai-console](https://github.com/mamoe/mirai-console) 不保证能100%兼容。如果使用其他版本的请自行尝试是否兼容。
    如果你不清楚mirai-console如何运行，可以使用我自己打包的mirai-console-1.0.0的包。链接：https://pan.baidu.com/s/1WjwsjX1kSMCom2_aJSZBtQ 提取码hui'fu恢复：setu
    - mirai-console需要java环境，建议使用java11以及以上的版本运行。
2. 插件下载
    - 前往本项目的[releases](https://github.com/meaningtree/mirai-setu/releases)下载插件
3. 插件运行
    - 将本放入mirai-console的plugins的文件夹然后运行mirai-console。
4. 插件配置
    - 方法一：运行mirai输入控制台/serkey /setmaster对插件配置（/help可以查看帮助，建议使用）
    - 方法二：运行一次mirai-console关闭（记得一定要关闭mirai-console，否则修改的数值很可能会被mirai-console覆盖掉），进入./config/Mirai-setu文件夹参考注释修改配置文件。
5. 关于lollicon的注意事项
    - lolicon是一个公开的setu库的APi，此API不属于本人，如果此API出现问题，恕我无力解决。图片获取是从i.pixiv.cat反向代理得到的，可以不使用科学上网获取，但是国内网络获取比较慢，获取卡顿和失败是正常情况。如果有条件的话可以使用科学上网进行加速，或者部署到没有限制的服务器上。
    - lolicon的APIKEy申请需要到Telegram上申请，需要使用科学上网，请自备工具。
## 指令
指令可以在配置文件自由修改

    色图时间 //获取随机色图
    搜色图 [关键词]  //根据关键词搜索色图
    封印解除 //开启本群的色图功能（仅限插件主人使用）
    封印    //关闭本群的色图功能
    青少年模式 //普通模式，不主动搜索R18图片（在配置文件中开启R18才能使用）
    青壮年模式 //R18模式，主动搜索R18图片（在配置文件中开启R18才能使用）
    今日番剧 //顾名思义，来自bilibili
    昨日番剧 //顾名思义，来自bilibili
    明日番剧 //顾名思义，来自bilibili

## 配置文件
参考配置文件的注释
