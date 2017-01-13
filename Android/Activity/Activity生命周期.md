# Activity生命周期

- 启动一个Activity_A: onCreate,onStart,onResume;

- 在Activity_A界面按返回键:onPause,onStop,onDestroy;

- 在Activity_A内点击按钮跳转到另外一个Activity_B:onPause,onStop;从Activity_B按返回键,返回到Activity_A界面:onRestart,onStart,onResume;

```java
public  void play(View view){
        Intent intent=new Intent();
        intent.setClass(this, Activity_B.class);
        intent.putExtra("videoPath", "rtmp://live.hkstv.hk.lxdns.com/live/hks");
        startActivity(intent);
    }
```

- 在Activity_A内点击按钮跳转到另外一个Activity_B:onPause,onStop,onDestroy;从Activity_B按返回键,无法返回到Activity_A界面。

```java
public  void play(View view){
        Intent intent=new Intent();
        intent.setClass(this, Activity_B.class);
        intent.putExtra("videoPath", "rtmp://live.hkstv.hk.lxdns.com/live/hks");
        startActivity(intent);
        finish();
    }
```

- 在Activity_A界面按电源键:onPause,onStop;接着再按一次电源键:onRestart,onStart,onResume.

- 在在Activity_A界面按Home键:onPause,onStop;接着再按一次Home键:onRestart,onStart,onResume.

- 在Activity界面显示调用Activity的finish()方法:onPause,onStop,onDestroy;
