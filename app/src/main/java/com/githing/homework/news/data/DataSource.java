package com.githing.homework.news.data;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * @author pofeng <pofeng@wacai.com>
 * @date 2018/03/07
 */
public class DataSource {

    private static final String data = "[\n" +
            "    {\n" +
            "        \"uniquekey\": \"4eff40e6e5cce30bd222e935b831a610\",\n" +
            "        \"title\": \"继父当众锁喉少年遭起诉 内情公开后获赞\\\"英雄\\\"\",\n" +
            "        \"date\": \"2018-03-07 16:59\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"看看新闻网\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307165952480.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://02.imgmini.eastday.com/mobile/20180307/20180307165952_928e67c1a58c2b0af0cd5bc0b6c0c58d_2_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s02\": \"http://02.imgmini.eastday.com/mobile/20180307/20180307165952_928e67c1a58c2b0af0cd5bc0b6c0c58d_3_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s03\": \"http://02.imgmini.eastday.com/mobile/20180307/20180307165952_928e67c1a58c2b0af0cd5bc0b6c0c58d_1_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"e8ca085a2e9ed8dde61ed6e7212e320c\",\n" +
            "        \"title\": \"日本九州新燃岳火山持续喷发 浓烟高度达3000米\",\n" +
            "        \"date\": \"2018-03-07 17:08\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"人民网\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307170825573.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://05.imgmini.eastday.com/mobile/20180307/20180307170825_22edabccae5ae3cf35d6cac0d3dee264_1_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"4427f7a89621a3cb154259d397464caa\",\n" +
            "        \"title\": \"扶贫办主任：去年对大病、重病、慢病救治420万人\",\n" +
            "        \"date\": \"2018-03-07 16:58\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"中国新闻网\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307165815621.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://01.imgmini.eastday.com/mobile/20180307/20180307165815_55f899f6751b155a33e3053cd40eeb1f_1_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"0d1d881fb3db5c662e8452e0140c88be\",\n" +
            "        \"title\": \"5个动作重复360次，帮你完美去塑造美背\",\n" +
            "        \"date\": \"2018-03-07 16:50\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"一块大腹肌\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307165010896.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://03.imgmini.eastday.com/mobile/20180307/20180307165010_f16cc8e55b7453d647f8a48665de9fc8_1_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s02\": \"http://03.imgmini.eastday.com/mobile/20180307/20180307165010_f16cc8e55b7453d647f8a48665de9fc8_7_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s03\": \"http://03.imgmini.eastday.com/mobile/20180307/20180307165010_f16cc8e55b7453d647f8a48665de9fc8_8_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"29bc5debb15454c3c2618b111b046e8b\",\n" +
            "        \"title\": \"外媒：政府工作报告释放中国扩大开放信号 力度“超预期”\",\n" +
            "        \"date\": \"2018-03-07 16:47\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"国际在线\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307164727283.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://05.imgmini.eastday.com/mobile/20180307/20180307164727_0ec9367c12101208933d7c2d1fde03a2_1_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"6361d7cdd03bbfdd1e53e4a4695c74a0\",\n" +
            "        \"title\": \"扶贫办谈生态扶贫：山西把贫困人口组织起来植树造林\",\n" +
            "        \"date\": \"2018-03-07 16:41\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"海外网\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307164158085.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://00.imgmini.eastday.com/mobile/20180307/20180307164158_0418aae2bb11d0c97ee484117b8e8313_1_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"5ca45a81657f1eda98e6a2710d78dccd\",\n" +
            "        \"title\": \"埃尔多安批北约指责土购买S-400是双重标准：希腊买S-300为何不说？\",\n" +
            "        \"date\": \"2018-03-07 16:25\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"千龙网\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307162515957.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://06.imgmini.eastday.com/mobile/20180307/20180307162515_cf8da9a1945869cc9f2c731b28f307a5_1_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"019fe71d8dd2dfbf8d2c85af30400b8f\",\n" +
            "        \"title\": \"明星躲记者手段各不同，有人纸袋套头，有人棉被包脸\",\n" +
            "        \"date\": \"2018-03-07 16:23\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"北青网\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307162335917.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://01.imgmini.eastday.com/mobile/20180307/20180307162335_12a51dad5b0f6500f68dd3cf10441efb_5_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s02\": \"http://01.imgmini.eastday.com/mobile/20180307/20180307162335_75bbe29ef4f3a84a1401b97213502357_1_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s03\": \"http://01.imgmini.eastday.com/mobile/20180307/20180307162335_404aa71b10c6762a092a1288fd790166_7_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"a15765cdadeaa9b46232a45fdf57a0ad\",\n" +
            "        \"title\": \"今天国际应邀出席中国数字化工厂应用及发展大会\",\n" +
            "        \"date\": \"2018-03-07 16:21\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"海外网\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307162117786.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://04.imgmini.eastday.com/mobile/20180307/20180307162117_603e19b3d0fc4a78f796bf79e8e892fb_2_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s02\": \"http://04.imgmini.eastday.com/mobile/20180307/20180307162117_603e19b3d0fc4a78f796bf79e8e892fb_1_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s03\": \"http://04.imgmini.eastday.com/mobile/20180307/20180307162117_51d29d23a6b67543c61067e0fb02a532_3_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"42a6d87e00afce188a97f4d73fb75469\",\n" +
            "        \"title\": \"科技是核心战斗力|从两次大阅兵看我军装备发展这五年\",\n" +
            "        \"date\": \"2018-03-07 16:20\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"中青在线\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307162040597.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://04.imgmini.eastday.com/mobile/20180307/20180307162040_78468b523738a957863e22659453667c_21_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s02\": \"http://04.imgmini.eastday.com/mobile/20180307/20180307162040_082d05f1b9a2cd79929081e0e7355ac5_2_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s03\": \"http://04.imgmini.eastday.com/mobile/20180307/20180307162040_87691ed7621a66903202ea31152ac361_16_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"c980108d1c26f9416221d7b5002da425\",\n" +
            "        \"title\": \"共和党议员担忧特朗普关税政策将影响美国人就业\",\n" +
            "        \"date\": \"2018-03-07 16:20\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"中国搜索\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307162023853.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://00.imgmini.eastday.com/mobile/20180307/20180307162023_df920c5051249b5d3be8782c07699541_1_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"ae472ecdd97ebc60bccbab3d52d47f95\",\n" +
            "        \"title\": \"简单的头倒立，你还在单纯的腿伸直？这些花样，每个都够玩一天！\",\n" +
            "        \"date\": \"2018-03-07 16:18\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"一起练瑜伽网\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307161852982.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://02.imgmini.eastday.com/mobile/20180307/20180307161852_8a144260bbe67730c0ede00b9893f932_17_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s02\": \"http://02.imgmini.eastday.com/mobile/20180307/20180307161852_8a144260bbe67730c0ede00b9893f932_7_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s03\": \"http://02.imgmini.eastday.com/mobile/20180307/20180307161852_8a144260bbe67730c0ede00b9893f932_15_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"ca7e8bb92c75aef8348175e49283c6b5\",\n" +
            "        \"title\": \"男子酒驾被追捕慌乱跳车 没拉手刹撞倒自己\",\n" +
            "        \"date\": \"2018-03-07 16:09\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"看看新闻网\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307160933234.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://01.imgmini.eastday.com/mobile/20180307/20180307160933_d66992082920e97d8e8cdfb93bd1cdcc_1_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s02\": \"http://01.imgmini.eastday.com/mobile/20180307/20180307160933_d66992082920e97d8e8cdfb93bd1cdcc_2_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"82c8d5fb1a244f852c98e65ef384e2d7\",\n" +
            "        \"title\": \"农业部部长韩长赋：要让农民成为有吸引力的职业\",\n" +
            "        \"date\": \"2018-03-07 16:04\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"经济网\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307160438743.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://00.imgmini.eastday.com/mobile/20180307/20180307160438_3f732f10192c009a82c94137c0f01b84_2_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s02\": \"http://00.imgmini.eastday.com/mobile/20180307/20180307160438_3f732f10192c009a82c94137c0f01b84_1_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"cbdd12afe3e18fc77b783a56f63d8d1a\",\n" +
            "        \"title\": \"“辣眼睛”的社会陋习何时休？\",\n" +
            "        \"date\": \"2018-03-07 16:02\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"东方网\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307160252760.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://08.imgmini.eastday.com/mobile/20180307/20180307160252_c55899e40778339b73d4e221687813f2_1_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"2e6dce6630c686b10b2abd18d2a84a6f\",\n" +
            "        \"title\": \"驻毛里求斯大使孙功谊在华侨华人庆祝元宵节晚宴上的讲话\",\n" +
            "        \"date\": \"2018-03-07 15:55\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"驻毛里求斯使馆\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307155500533.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://03.imgmini.eastday.com/mobile/20180307/20180307155500_a68958074b1dbb38890c8a813a7e0cc5_1_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"588817f813d6330ea22e4315ebe8b483\",\n" +
            "        \"title\": \"为祖国点赞！中铁北京工程局员工观看电影 《厉害了，我的国》\",\n" +
            "        \"date\": \"2018-03-07 15:54\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"人民铁道网\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307155428413.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://03.imgmini.eastday.com/mobile/20180307/20180307155428_750c84d3500629ac0fe3fbe02aa05f6f_1_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s02\": \"http://03.imgmini.eastday.com/mobile/20180307/20180307155428_750c84d3500629ac0fe3fbe02aa05f6f_2_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s03\": \"http://03.imgmini.eastday.com/mobile/20180307/20180307155428_750c84d3500629ac0fe3fbe02aa05f6f_3_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"bba3f2aaece40e52cc9f175afa636dda\",\n" +
            "        \"title\": \"是早上6点晨跑的减脂效果好些，还是晚上9点以后减脂效果好？\",\n" +
            "        \"date\": \"2018-03-07 15:51\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"并不是很喜欢这个名字\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307155101899.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://04.imgmini.eastday.com/mobile/20180307/20180307155101_ea69dfa0de86e630795ab73912b41a93_4_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s02\": \"http://04.imgmini.eastday.com/mobile/20180307/20180307155101_ea69dfa0de86e630795ab73912b41a93_1_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s03\": \"http://04.imgmini.eastday.com/mobile/20180307/20180307155101_ea69dfa0de86e630795ab73912b41a93_3_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"9717820dbc7ecd2297954e57e0d062ef\",\n" +
            "        \"title\": \"【乡村振兴我建言】自治、法治、德治相结合推进乡村治理\",\n" +
            "        \"date\": \"2018-03-07 15:50\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"中青在线\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307155032284.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://08.imgmini.eastday.com/mobile/20180307/20180307155032_f8d40414debd8268259915faaaccb8a7_3_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s02\": \"http://08.imgmini.eastday.com/mobile/20180307/20180307155032_f8d40414debd8268259915faaaccb8a7_5_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s03\": \"http://08.imgmini.eastday.com/mobile/20180307/20180307155032_f8d40414debd8268259915faaaccb8a7_2_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"4992bed0667a28aff921f185f37639f9\",\n" +
            "        \"title\": \"日媒称中国军队引入高端人工智能 或率先实现无人化\",\n" +
            "        \"date\": \"2018-03-07 15:38\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"参考消息网\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307153804637.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://08.imgmini.eastday.com/mobile/20180307/20180307153804_26478b605e8d67314e7cc5f206704611_1_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"e7e47d86b685de8bf6e42e654e71c5c6\",\n" +
            "        \"title\": \"这三大星座最好缘分到来，属于你的专属爱情正在路上！\",\n" +
            "        \"date\": \"2018-03-07 15:36\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"亮亮聊星座\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307153635226.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://03.imgmini.eastday.com/mobile/20180307/20180307153635_9e90aab846bf3aa6966a9d6803fbbcd5_1_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s02\": \"http://03.imgmini.eastday.com/mobile/20180307/20180307153635_9e90aab846bf3aa6966a9d6803fbbcd5_2_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s03\": \"http://03.imgmini.eastday.com/mobile/20180307/20180307153635_9e90aab846bf3aa6966a9d6803fbbcd5_3_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"a7096f506e764717efeec203f1ce7098\",\n" +
            "        \"title\": \"电商自营家电服务对比：京东\\\"36计\\\"PK苏宁\\\"46招\\\"\",\n" +
            "        \"date\": \"2018-03-07 15:27\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"科技传播站\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307152750669.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://01.imgmini.eastday.com/mobile/20180307/20180307152750_8ebb0b372691531ed1ea273cd2b7f7cc_1_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s02\": \"http://01.imgmini.eastday.com/mobile/20180307/20180307152750_8ebb0b372691531ed1ea273cd2b7f7cc_2_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s03\": \"http://01.imgmini.eastday.com/mobile/20180307/20180307152750_8ebb0b372691531ed1ea273cd2b7f7cc_3_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"326cab1a381bd0c784475a7b8f4274fb\",\n" +
            "        \"title\": \"这种藕你一定没吃过, 口感酸酸甜甜, 看起来也很漂亮\",\n" +
            "        \"date\": \"2018-03-07 15:16\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"美食美客嗨起来\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307151614408.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://04.imgmini.eastday.com/mobile/20180307/20180307_7cadce670b7de4a50878f2100b651f8d_cover_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s02\": \"http://04.imgmini.eastday.com/mobile/20180307/20180307_92e8f163429cbd063af82b654ad00be3_cover_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s03\": \"http://04.imgmini.eastday.com/mobile/20180307/20180307_77948fb17a82c416304e74027a72d22e_cover_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"e7f9a23bc7ea69e84ce29cfec18d5832\",\n" +
            "        \"title\": \"重磅！沪四价宫颈癌疫苗明起陆续可接种！287个接种点在此\",\n" +
            "        \"date\": \"2018-03-07 15:13\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"上海发布\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307151322178.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://02.imgmini.eastday.com/mobile/20180307/20180307151322_89e1fee2cf18b1a4ddc85d4db94c8393_1_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"e0ff788de4df3fc03e53f1ed0e52c4b6\",\n" +
            "        \"title\": \"找女朋友，这种有肌肉的很受欢迎\",\n" +
            "        \"date\": \"2018-03-07 15:12\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"最佳健康\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307151225675.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://00.imgmini.eastday.com/mobile/20180307/20180307151225_9f46532e6d9d59cbda5125b59a06405a_2_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s02\": \"http://00.imgmini.eastday.com/mobile/20180307/20180307151225_9f46532e6d9d59cbda5125b59a06405a_18_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s03\": \"http://00.imgmini.eastday.com/mobile/20180307/20180307151225_9f46532e6d9d59cbda5125b59a06405a_16_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"5567477b589030ba656eefd6e0b768b4\",\n" +
            "        \"title\": \"两会“早”知道│人代会审议宪法修正案草案\",\n" +
            "        \"date\": \"2018-03-07 15:11\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"陕西传媒网\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307151138032.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://04.imgmini.eastday.com/mobile/20180307/20180307151138_0a9d0760005e3b37e958d85516041fb2_2_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"6edef412d04e25002c610028b744a5a7\",\n" +
            "        \"title\": \"朋友圈疯传的“刑侦推理试题” 出题人竟是杭州中学生！第一题就懵了！\",\n" +
            "        \"date\": \"2018-03-07 15:07\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"杭州日报\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307150754993.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://02.imgmini.eastday.com/mobile/20180307/20180307150754_dcba412d3faf5cfbd1b1eb15eab27b31_1_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s02\": \"http://02.imgmini.eastday.com/mobile/20180307/20180307150754_e706864f1b87df74d2e17489180c0fe2_2_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s03\": \"http://02.imgmini.eastday.com/mobile/20180307/20180307150754_14689eb8b7cf76708916614ce73e339e_3_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"ec482e21d89b04cc7a482b3f48b3746d\",\n" +
            "        \"title\": \"三八女人节到了！送你999朵玫瑰花，祝你永远青春美丽如花\",\n" +
            "        \"date\": \"2018-03-07 15:07\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"倾听美文\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307150719264.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://04.imgmini.eastday.com/mobile/20180307/20180307150719_be732c6e2858a3feada1bd9150f28dd1_4_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s02\": \"http://04.imgmini.eastday.com/mobile/20180307/20180307150719_be732c6e2858a3feada1bd9150f28dd1_3_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s03\": \"http://04.imgmini.eastday.com/mobile/20180307/20180307150719_be732c6e2858a3feada1bd9150f28dd1_5_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"96b16c2c81cc41582f7bc5334f62e6fb\",\n" +
            "        \"title\": \"美F-35B首次舰上部署 美媒：“主宰”亚太地区利器\",\n" +
            "        \"date\": \"2018-03-07 15:03\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"解放网\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307150347782.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://04.imgmini.eastday.com/mobile/20180307/20180307150347_7128353c92af29682128928f872a8a2d_1_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s02\": \"http://04.imgmini.eastday.com/mobile/20180307/20180307150347_7128353c92af29682128928f872a8a2d_2_mwpm_03200403.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"uniquekey\": \"d46ed8ba6518c109f3bce1a6a549d2e1\",\n" +
            "        \"title\": \"[综合]苏打绿经纪人回应解散传闻 那些已经解散的组合如今怎么样了？\",\n" +
            "        \"date\": \"2018-03-07 15:02\",\n" +
            "        \"category\": \"头条\",\n" +
            "        \"author_name\": \"多彩贵州网\",\n" +
            "        \"url\": \"http://mini.eastday.com/mobile/180307150226768.html\",\n" +
            "        \"thumbnail_pic_s\": \"http://08.imgmini.eastday.com/mobile/20180307/20180307150226_15ca8d562df7fece50445abf7afc91cb_3_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s02\": \"http://08.imgmini.eastday.com/mobile/20180307/20180307150226_15ca8d562df7fece50445abf7afc91cb_7_mwpm_03200403.jpg\",\n" +
            "        \"thumbnail_pic_s03\": \"http://08.imgmini.eastday.com/mobile/20180307/20180307150226_15ca8d562df7fece50445abf7afc91cb_9_mwpm_03200403.jpg\"\n" +
            "    }\n" +
            "]";

    public static List<NewsBean> getData() {
        return JSON.parseArray(data, NewsBean.class);
    }
}
