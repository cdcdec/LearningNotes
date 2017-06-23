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

* 获取视频的信息
  ffprobe TheStrain101.mp4
* ffmpeg -i TheStrain101.mkv TheStrain101.mp4 //将mkv的视频转换成mp4的
* ffmpeg -i 2.swf hello.flv


ffmpeg -i gm.rmvb -acodec copy -vcodec libx264 -b 560k -ss 00:22:41 -to  00:28:30 -f mp4 02.mp4


1.pass1编码
ffmpeg -i 01.rmvb -an -vcodec libx264 -b 560k -pass 1 -f mp4 -y NUL
-an : 不编码音频
-vcodec : 设置视频的编码，我这里使用的是x264
-b : 这个是码率
-f : 强制使用格式
-y : 自动输y确认
NUL : 因为是pass1 所以不需要输出文件，直接用NUL
2.pass2编码
ffmpeg -i 01.rmvb -acodec copy -vcodec libx264 -b 560k -pass 2 -f mp4 01.mp4
因为现在很多rmvb的音频部分都是aac编码的，所以可以直接用-acodec copy复制音频部份
3、针对某些文件的参数调整
有些rmvb或着mkv之类的分辨率比较高，所以传到itouch需要调整一下。在ffmpeg里面可以用-s参数:
ffmpeg -i 01.rmvb -acodec copy -vcodec libx264 -b 560k -s 960x640 -f mp4 01.mp4
960x640需要自己计算一下，按比例进行调整
按时间截取:
ffmpeg -i 01.rmvb -acodec copy -vcodec libx264 -b 560k -ss 00:00:00 -t 00:01:00 -f mp4 01.mp4
设置B-frame对动画片有些好处，2pass的时候不是很明显，1pass的比较明显:
ffmpeg -i 01.rmvb -acodec copy -vcodec libx264 -b 560k -bf 6 -f mp4 01.mp4




ffmpeg -i 异星觉醒.rmvb -acodec copy -vcodec libx264 -b 560k -ss 00:33:01 -to  00:34:35 -f mp4 011.mp4











