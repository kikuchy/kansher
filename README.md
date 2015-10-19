# 🙇 Osewer

**Osewer** is the gradle plugin for generating Legal Alignment screen.

```
osewer {
	// Setting outputs and you can see "Alignments.txt" in "{project_root}/build/intermidiate/".
	destination "build/intermidiate"
	type OsewerExportType.TEXT_FILE
	
	alignments {
    	// List up LICENSE files using in your project.
		align  "ButterKnife", "https://raw.githubusercontent.com/JakeWharton/butterknife/master/LICENSE.txt"
		align "RxJava", "https://raw.githubusercontent.com/ReactiveX/RxJava/1.x/LICENSE"
	}
}
```