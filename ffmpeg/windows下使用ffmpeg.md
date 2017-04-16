# Windows下使用ffmpeg
* http://ffmpeg.zeranoe.com/builds/
  下载32位的windows静态版本
  http://ffmpeg.zeranoe.com/builds/win32/static/

* 配置环境变量
在系统环境变量的path里面添加值,例如:D:\ffmpeg\ffmpeg-latest-win32-static\bin;
在cmd里面执行命令:ffmpeg -version

* 从视频里面提取音频并保存成mp3格式的
ffmpeg -i a.mp4 -f mp3 -vn ab.mp3
上述命令将文件a.mp4里面提取出音频并保存在ab.mp3里面;
	* -i 表示input，即输入文件
	* -f 表示format，即输出格式
	* -vn表示vedio not，即输出不包含视频

* 截取某段视频 
ffmpeg  -i tpsj.mp4 -vcodec copy -acodec copy -ss 00:01:30 -to 00:05:48 cutout1.mp4 -y
-i:表示视频源文件;
从00:01:30开始截区到00:05:48,
-vcodec copy表示使用跟原视频一样的视频编解码器;
-acodec copy表示使用跟原视频一样的音频编解码器;
-y 表示如果输出文件已存在则覆盖;



