# WebView

## 自定义错误页面?

## 缓存?

## 支持缩放,但隐藏缩放按钮

```txt
//设置可以支持缩放
webSettings.setSupportZoom(true);
webSettings.setBuiltInZoomControls(true);
//不显示webview缩放按钮
webSettings.setDisplayZoomControls(false);
```

## 加载百度地图

```txt
// 加载百度地图
webSettings.setDomStorageEnabled(true);
```
