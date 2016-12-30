# meta-data

##### 详情
[https://developer.android.com/guide/topics/manifest/meta-data-element.html](https://developer.android.com/guide/topics/manifest/meta-data-element.html)

##### 位置

可以在以下节点中包含(即作为以下元素的一个子元素):

```txt
<activity>
<activity-alias>
<application>
<provider>
<receiver>
<service>
```

##### 描述

这个名字值是额外的任意的可以提供给父组件的数据。一个组件元素能够包含任意数量的meta-data子元素。它们所有的值都会被收集在Bundle对象中并且使其可以作为组件的 PackageItemInfo.metaData 字段。 一般的值可以通过value属性来指定，但是如果要指定一个资源id作为一个值，那么就要用resource属性来代替。

A name-value pair for an item of additional, arbitrary data that can be supplied to the parent component. A component element can contain any number of <meta-data> subelements. The values from all of them are collected in a single Bundle object and made available to the component as the PackageItemInfo.metaData field.

Ordinary values are specified through the value attribute. However, to assign a resource ID as the value, use the resource attribute instead. For example, the following code assigns whatever value is stored in the @string/kangaroo resource to the "zoo" name:
```xml
<meta-data android:name="zoo" android:value="@string/kangaroo" />

```

On the other hand, using the resource attribute would assign "zoo" the numeric ID of the resource, not the value stored in the resource:

```xml

<meta-data android:name="zoo" android:resource="@string/kangaroo" />

```

##### 与string的区别

strings和meta-data看起来似乎并没有什么太大区别，但实际上有作用域的问题，strings只能在应用本地被读取，而处于AndroidManifests.xml下的meta-data则是对外界开放的，是向系统注册的信息，系统及外界是可以通过PackageInfo相关API获取到meta-data的信息的，二者关系可以形象一点看待是私有和公有的关系。

##### 读取meta-data值示例

```txt
/**
     * 读取application 节点  meta-data 信息
     */  
    private void readMetaDataFromApplication() {  
        try {  
            ApplicationInfo appInfo = this.getPackageManager()  
                    .getApplicationInfo(getPackageName(),  
                            PackageManager.GET_META_DATA);  
            String mTag = appInfo.metaData.getString("mTag");  

            Log.e(TAG, "mTag=" + mTag);  

        } catch (NameNotFoundException e) {  
            e.printStackTrace();  
        }  
    }  

    /**
     * 读取BroadcastReceiver 节点  meta-data 信息
     */  
    private void readMetaDataFromBroadCast() {  
        try {  
            ComponentName cn = new ComponentName(this, DemoReceiver.class);  
            ActivityInfo info = this.getPackageManager().getReceiverInfo(cn,  
                    PackageManager.GET_META_DATA);  
            String mTag = info.metaData.getString("mTag");  
            Log.e(TAG, "mTag=" + mTag);  
        } catch (NameNotFoundException e) {  
            e.printStackTrace();  
        }  
    }  

    /**
     * 读取Service 节点  meta-data 信息
     */  
    private void readMetaDataFromService() {  
        try {  
            ComponentName cn = new ComponentName(this, DemoService.class);  
            ServiceInfo info = this.getPackageManager().getServiceInfo(cn,  
                    PackageManager.GET_META_DATA);  
            String mTag = info.metaData.getString("mTag");  
            Log.e(TAG, "mTag=" + mTag);  
        } catch (NameNotFoundException e) {  
            e.printStackTrace();  
        }  
    }  

    /**
     * 读取Activity 节点  meta-data 信息
     */  
    private void readMetaDataFromActivity() {  
        ActivityInfo info;  
        try {  
            info = this.getPackageManager().getActivityInfo(getComponentName(),  
                    PackageManager.GET_META_DATA);  
            String mTag = info.metaData.getString("mTag");  
            Log.e(TAG, "mTag=" + mTag);  

            //读取图片资源id  
            int mResource = info.metaData.getInt("mResource");  

            iv_pic.setImageResource(mResource);  

        } catch (NameNotFoundException e) {  
            e.printStackTrace();  
        }  

    }  
```

AndroidManifests.xml

```txt
<?xml version="1.0" encoding="utf-8"?>  
<manifest xmlns:android="http://schemas.android.com/apk/res/android"  
    package="com.example.metadatatest"  
    android:versionCode="1"  
    android:versionName="1.0" >  

    <uses-sdk  
        android:minSdkVersion="8"  
        android:targetSdkVersion="8" />  

    <application  
        android:allowBackup="true"  
        android:icon="@drawable/ic_launcher"  
        android:label="@string/app_name"  
        android:theme="@style/AppTheme" >  

        <meta-data android:name="mTag" android:value="@string/meta_application"></meta-data>  

        <activity  
            android:name="com.example.metadatatest.MainActivity"  
            android:label="@string/app_name" >  
            <intent-filter>  
                <action android:name="android.intent.action.MAIN" />  

                <category android:name="android.intent.category.LAUNCHER" />  
            </intent-filter>  

            <!-- 一般的值可以通过value属性来指定，但是如果要指定一个资源id作为一个值，那么就要用resource属性来代替。 -->  
            <meta-data android:name="mTag" android:value="@string/meta_activity"></meta-data>  

            <!--利用resource属性将指定 mResource 的资源id号-->  
            <meta-data android:name="mResource" android:resource="@drawable/ic_launcher"></meta-data>  
        </activity>  

        <service android:name="com.example.metadatatest.service.DemoService">  
            <meta-data android:name="mTag" android:value="@string/meta_service"></meta-data>  
        </service>  

        <receiver android:name="com.example.metadatatest.receiver.DemoReceiver">  
            <intent-filter android:priority="1000">  
                <action android:name="android.intent.action.BOOT_COMPLETED"/>  
            </intent-filter>  
            <meta-data android:name="mTag" android:value="@string/meta_broadcast"></meta-data>  
        </receiver>  

    </application>  

</manifest>  

```
