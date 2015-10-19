# 🙇 Osewer 🎁

**Osewer** is the gradle plugin for generating Legal Alignment screen.

```
osewer {
	// Setting outputs and you can see "Alignments.txt" in "{project_root}/build/intermidiate/".
	destination = "build/intermidiate"
	type =  OsewerExportType.TEXT_FILE
	
	// You can specify your original thanks message (Optinal).
	thanksMessage = "Special thanks for therse libraries!"
	
	gratefulness {
    	// List up LICENSE files using in your project.
		thanks  "ButterKnife", "https://raw.githubusercontent.com/JakeWharton/butterknife/master/LICENSE.txt"
		thanks "RxJava", "https://raw.githubusercontent.com/ReactiveX/RxJava/1.x/LICENSE"
	}
}
```

## What it means...

"Osewer" comes from a Japanese word "お世話" (Osewa).

It means taking care, help somedodys or assistance.

Our product is made up of many libraries and softwares.

Legal Alignment is one of obligation, but this is the way of telling "thank you" for creators of libraries.

Why don't you tell your thanks? And fill your `build.gradle` with thankfullness and happiness!