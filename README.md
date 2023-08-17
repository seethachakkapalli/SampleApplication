DataBinding 

1. inside app level build.gradle file
dataBinding {
        enabled = true
    }

2. inside activity_main.xml file
   convert root layout to <layout> </layout> tag

3. MainActivity - Bind view using generated class
   val binding = ActivityMainBinding.inflate(layoutInflater)
   setContentView(binding.root)




