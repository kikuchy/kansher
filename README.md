# 🙏 Kansher 🎁

**Kansher** is the gradle plugin for generating Legal Alignment screen.

```
kansher {
	// Setting outputs and you can see "Alignments.txt" in "{project_root}/build/intermidiate/".
	destination = "build/intermidiate"
	type =  KansherExportType.TEXT_FILE
	
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

"Kansher" comes from a Japanese word "感謝" (kɑ́ːnʃɑ).

It means a thankfulness or gratitude.

Our product is made up of many libraries and softwares.

Notice of License is one of obligation, but this is the way of telling "thank you" for creators of libraries.

Why don't you tell your thanks? And fill your `build.gradle` with thankfullness and happiness!