# SpringBootUeditor
SpringBoot集成百度 UEditor的例子，运行工程，打开 http://127.0.0.1:9001 查看效果

* 配置文件 config.json 移到src目录中
* 上传生成缩略图

# 修改步骤

## 加入nas目录

增加nas配置 `nas.home`。修改 `UEditorController` 代码，使用该目录。

## 把列表项背景图片和表情图标放到nas目录。


```
ueditor-list
ueditor-emotion
```

并修改官方例子bug。（图片文件名大小写问题。）


## 修改默认配置

修改 `config.json` 中路径。（把 `/ueditor/jsp/upload` 去掉）

把 `列出指定目录下的图片` 修改为 `favimage`，把 `列出指定目录下的文件` 修改为 `favfile` 。放入预设图片和文件。

