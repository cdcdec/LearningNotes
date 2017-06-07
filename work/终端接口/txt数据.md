# txt数据
数据来源DownGoingMIPDFile/json/sort/mobile/project.txt,内容如下:

{"content":
[{"project_type":"0","project_id":"29","img_pathb":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/29b.png","img_patha":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/29a.png","project_name":"安康服务"},{"project_type":"0","project_id":"30","img_pathb":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/30b.png","img_patha":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/30a.png","project_name":"便民导航"},{"project_type":"0","project_id":"32","img_pathb":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/32b.png","img_patha":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/32a.png","project_name":"电子政务"},{"project_type":"2","project_id":"36","img_pathb":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/36b.png","img_patha":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/36a.png","project_name":"应急广播"},{"project_type":"1","project_id":"34","img_pathb":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/34b.png","img_patha":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/34a.png","project_name":"全媒影视"},{"project_type":"1","project_id":"35","img_pathb":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/35b.png","img_patha":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/35a.png","project_name":"卫星专线"},{"project_type":"1","project_id":"31","img_pathb":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/31b.png","img_patha":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/31a.png","project_name":"电子巡更"},{"project_type":"1","project_id":"33","img_pathb":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/33b.png","img_patha":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/33a.png","project_name":"实时通讯"},{"project_type":"1","project_id":"37","img_pathb":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/37b.png","img_patha":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/37a.png","project_name":"更多精彩"}]}



project_type:项目的类型.为0时表示数据是来自后台采集的;为1时表示项目还没有开通;其它情况的项目用2表示。
project_id:本项目对应的id，进入到下一级的标志。如,"project_id":"29",表示"安康服务"项目的数据在文件project29.txt里面。
project_name:为本页面九个模块的名字(在程序里目前没有到这个名字,只是作为一个标记,便于理解数据)。
img_patha:本页面默认显示的图片的路径。
img_pathb:本页面点击默认显示的图片后显示的图片的路径。

这一部分内容的后台路径为:http://211.103.169.250:7080/DownGoingMIPDFile/json/sort/mobile/sort+id.txt,id值是通过上一级页面传递过来的.
例如:http://211.103.169.250:7080/DownGoingMIPDFile/json/sort/mobile/sort252.txt内容如下:

{"title_path":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/title252.png","content":
[{"sort_next":"y","img_path":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/253.png","sort_name":"应急常识","sort_id":"253"},
{"sort_next":"y","img_path":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/254.png","sort_name":"应急新闻","sort_id":"254"},
{"sort_next":"n","img_path":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/255.png","sort_name":"应急电话","sort_id""},
{"sort_next":"n","img_path":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/256.png","sort_name":"家庭应急","sort_id":":"255256"},
{"sort_next":"n","img_path":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/257.png","sort_name":"预警播报","sort_id":"257"},
{"sort_next":"n","img_path":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/258.png","sort_name":"预警信号","sort_id":"258"},
{"sort_next":"n","img_path":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/259.png","sort_name":"警报系统","sort_id":"259"},
{"sort_next":"n","img_path":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/260.png","sort_name":"防御指南","sort_id":"260"},
{"sort_next":"n","img_path":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/261.png","sort_name":"避难场所","sort_id":"261"},
{"sort_next":"n","img_path":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/262.png","sort_name":"撤离路线","sort_id":"262"},
{"sort_next":"n","img_path":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/263.png","sort_name":"科普知识","sort_id":"263"},
{"sort_next":"n","img_path":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/264.png","sort_name":"恢复重建","sort_id":"264"},
{"sort_next":"n","img_path":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/265.png","sort_name":"救灾信息","sort_id":"265"},
{"sort_next":"n","img_path":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/266.png","sort_name":"求助问答","sort_id":"266"},
{"sort_next":"n","img_path":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/267.png","sort_name":"求助信号","sort_id":"267"},
{"sort_next":"n","img_path":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/571.png","sort_name":"应急广播","sort_id":"571"},
{"sort_next":"n","img_path":"http://211.103.169.250:7080/DownGoingMIPDFile/image/sort/mobile/572.png","sort_name":"我的空间","sort_id":"572"}]}

其中,title_path:是顶部的图片的地址;sort_next:表示是否有下一级,如果值为:y,表示有下一级,并且下一级的路径为:/DownGoingMIPDFile/json/sort/mobile/sort+sort_id的值,如果值为n,表示没有下一级,此时下面页面的路径为:/DownGoingMIPDFile/json/list/mobile/list+sort_id的值。
img_path:是页面图片的地址;sort_name:这个分类的名字(在程序里目前没有到这个名字,只是作为一个标记,便于理解数据)。


ffmpeg -i TheStrain101.mkv -vn -an -codec:s srt film.srt
Output file #0 does not contain any stream


ffmpeg -i F:\迅雷下载\TheStrain101.mkv -map 0:s:0 F:\迅雷下载\sub.srt

ffmpeg -i TheStrain101.mkv -map 0:s:1 sub.srt

Stream map '0:s:0' matches no streams.
To ignore this, add a trailing '?' to the map.


ffmpeg -i TheStrain101.mkv -an -vn -map 0:2 -c:s:0 srt sub1.srt
ffmpeg -i TheStrain101.mkv -an -vn -map 0:1 -c:s:0 srt sub1.srt

ffmpeg -i TheStrain101.mkv -an -vn -map 0:2 -map 0:3 -map 0:4 -c:s:0 srt -c:s:1 blah -c:s:2 foobar sub0.srt

ffmpeg -i TheStrain101.mkv -an -vn -c:s:0 srt sub0.srt 

ffmpeg -i TheStrain101.mkv -vf subtitles=subtitle.srt out.avi


ffmpeg -i TheStrain101.mkv