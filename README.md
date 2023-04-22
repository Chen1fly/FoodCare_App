# 新冠食疗app安卓端  
该项目仅为demo，界面比较难看，但基本逻辑都已实现（我认为足够应付普通的毕设了），具体可以根据自己的需求变更  
主要功能：  
1.登录注册  
2.首页轮播图，点击不同轮播图可以跳转至不同页面  
3.根据患者不同情况，首页显示不同内容  
4.患者患病时期选择  
## 说明  
本项目基于Android+SpringBoot开发，该仓库为Android端
## 使用指南  
请将项目直接导入Android Studio，全局替换将192.168.0.x替换为自己的Springboot端ip地址即可  
## 文件目录
``` 
├─.gradle
│  ├─7.5
│  │  ├─checksums
│  │  ├─dependencies-accessors
│  │  ├─executionHistory
│  │  ├─fileChanges
│  │  ├─fileHashes
│  │  └─vcsMetadata
│  ├─buildOutputCleanup
│  └─vcs-1
├─.idea
├─app
│  ├─build
│  │  ├─generated
│  │  │  ├─ap_generated_sources
│  │  │  │  └─debug
│  │  │  │      └─out
│  │  │  ├─data_binding_base_class_source_out
│  │  │  │  └─debug
│  │  │  │      └─out
│  │  │  │          └─com
│  │  │  │              └─food1
│  │  │  │                  └─databinding
│  │  │  ├─res
│  │  │  │  ├─pngs
│  │  │  │  │  └─debug
│  │  │  │  └─resValues
│  │  │  │      └─debug
│  │  │  └─source
│  │  │      └─buildConfig
│  │  │          └─debug
│  │  │              └─com
│  │  │                  └─food1
│  │  ├─intermediates
│  │  │  ├─aar_metadata_check
│  │  │  │  └─debug
│  │  │  ├─annotation_processor_list
│  │  │  │  └─debug
│  │  │  ├─apk
│  │  │  │  └─debug
│  │  │  ├─apk_ide_redirect_file
│  │  │  │  └─debug
│  │  │  ├─app_metadata
│  │  │  │  └─debug
│  │  │  ├─assets
│  │  │  │  └─debug
│  │  │  ├─compatible_screen_manifest
│  │  │  │  └─debug
│  │  │  ├─compile_and_runtime_not_namespaced_r_class_jar
│  │  │  │  └─debug
│  │  │  ├─compressed_assets
│  │  │  │  └─debug
│  │  │  │      └─out
│  │  │  ├─data_binding_base_class_log_artifact
│  │  │  │  └─debug
│  │  │  │      └─out
│  │  │  ├─data_binding_dependency_artifacts
│  │  │  │  └─debug
│  │  │  ├─data_binding_layout_info_type_merge
│  │  │  │  └─debug
│  │  │  │      └─out
│  │  │  ├─data_binding_layout_info_type_package
│  │  │  │  └─debug
│  │  │  │      └─out
│  │  │  ├─desugar_graph
│  │  │  │  └─debug
│  │  │  │      └─out
│  │  │  │          ├─currentProject
│  │  │  │          │  ├─dirs_bucket_0
│  │  │  │          │  ├─dirs_bucket_1
│  │  │  │          │  ├─dirs_bucket_2
│  │  │  │          │  ├─dirs_bucket_3
│  │  │  │          │  ├─dirs_bucket_4
│  │  │  │          │  ├─dirs_bucket_5
│  │  │  │          │  ├─jar_11e4c3a8b84ab711d98b751948fa1c8bc85d123dd2d5b47100eaa90b85126a41_bucket_0
│  │  │  │          │  ├─jar_11e4c3a8b84ab711d98b751948fa1c8bc85d123dd2d5b47100eaa90b85126a41_bucket_1
│  │  │  │          │  ├─jar_11e4c3a8b84ab711d98b751948fa1c8bc85d123dd2d5b47100eaa90b85126a41_bucket_2
│  │  │  │          │  ├─jar_11e4c3a8b84ab711d98b751948fa1c8bc85d123dd2d5b47100eaa90b85126a41_bucket_3
│  │  │  │          │  ├─jar_11e4c3a8b84ab711d98b751948fa1c8bc85d123dd2d5b47100eaa90b85126a41_bucket_4
│  │  │  │          │  └─jar_11e4c3a8b84ab711d98b751948fa1c8bc85d123dd2d5b47100eaa90b85126a41_bucket_5
│  │  │  │          ├─externalLibs
│  │  │  │          ├─mixedScopes
│  │  │  │          └─otherProjects
│  │  │  ├─dex
│  │  │  │  └─debug
│  │  │  │      ├─mergeDexDebug
│  │  │  │      ├─mergeExtDexDebug
│  │  │  │      ├─mergeLibDexDebug
│  │  │  │      │  ├─0
│  │  │  │      │  ├─1
│  │  │  │      │  ├─10
│  │  │  │      │  ├─11
│  │  │  │      │  ├─12
│  │  │  │      │  ├─13
│  │  │  │      │  ├─14
│  │  │  │      │  ├─15
│  │  │  │      │  ├─2
│  │  │  │      │  ├─3
│  │  │  │      │  ├─4
│  │  │  │      │  ├─5
│  │  │  │      │  ├─6
│  │  │  │      │  ├─7
│  │  │  │      │  ├─8
│  │  │  │      │  └─9
│  │  │  │      └─mergeProjectDexDebug
│  │  │  │          ├─0
│  │  │  │          ├─1
│  │  │  │          ├─10
│  │  │  │          ├─11
│  │  │  │          ├─12
│  │  │  │          ├─13
│  │  │  │          ├─14
│  │  │  │          ├─15
│  │  │  │          ├─2
│  │  │  │          ├─3
│  │  │  │          ├─4
│  │  │  │          ├─5
│  │  │  │          ├─6
│  │  │  │          ├─7
│  │  │  │          ├─8
│  │  │  │          └─9
│  │  │  ├─dex_archive_input_jar_hashes
│  │  │  │  └─debug
│  │  │  ├─dex_number_of_buckets_file
│  │  │  │  └─debug
│  │  │  ├─duplicate_classes_check
│  │  │  │  └─debug
│  │  │  ├─external_file_lib_dex_archives
│  │  │  │  └─debug
│  │  │  ├─external_libs_dex
│  │  │  │  └─debug
│  │  │  │      └─mergeExtDexDebug
│  │  │  ├─external_libs_dex_archive
│  │  │  │  └─debug
│  │  │  │      └─out
│  │  │  ├─external_libs_dex_archive_with_artifact_transforms
│  │  │  │  └─debug
│  │  │  │      └─out
│  │  │  ├─incremental
│  │  │  │  ├─dataBindingGenBaseClassesDebug
│  │  │  │  ├─debug
│  │  │  │  │  ├─mergeDebugResources
│  │  │  │  │  │  ├─merged.dir
│  │  │  │  │  │  │  └─values
│  │  │  │  │  │  └─stripped.dir
│  │  │  │  │  └─packageDebugResources
│  │  │  │  │      ├─merged.dir
│  │  │  │  │      │  └─values
│  │  │  │  │      └─stripped.dir
│  │  │  │  ├─debug-mergeJavaRes
│  │  │  │  │  └─zip-cache
│  │  │  │  ├─mergeDebugAssets
│  │  │  │  ├─mergeDebugJniLibFolders
│  │  │  │  ├─mergeDebugShaders
│  │  │  │  ├─packageDebug
│  │  │  │  │  └─tmp
│  │  │  │  │      └─debug
│  │  │  │  │          └─zip-cache
│  │  │  │  └─processDebugResources
│  │  │  ├─javac
│  │  │  │  └─debug
│  │  │  │      └─classes
│  │  │  │          └─com
│  │  │  │              └─food1
│  │  │  │                  ├─bean
│  │  │  │                  ├─databinding
│  │  │  │                  ├─ui
│  │  │  │                  │  ├─dashboard
│  │  │  │                  │  ├─home
│  │  │  │                  │  ├─Mine
│  │  │  │                  │  └─notifications
│  │  │  │                  └─utils
│  │  │  ├─local_only_symbol_list
│  │  │  │  └─debug
│  │  │  ├─manifest_merge_blame_file
│  │  │  │  └─debug
│  │  │  ├─merged_java_res
│  │  │  │  └─debug
│  │  │  ├─merged_jni_libs
│  │  │  │  └─debug
│  │  │  │      └─out
│  │  │  ├─merged_manifest
│  │  │  │  └─debug
│  │  │  ├─merged_manifests
│  │  │  │  └─debug
│  │  │  ├─merged_res
│  │  │  │  └─debug
│  │  │  ├─merged_res_blame_folder
│  │  │  │  └─debug
│  │  │  │      └─out
│  │  │  │          ├─multi-v2
│  │  │  │          └─single
│  │  │  ├─merged_shaders
│  │  │  │  └─debug
│  │  │  │      └─out
│  │  │  ├─mixed_scope_dex_archive
│  │  │  │  └─debug
│  │  │  │      └─out
│  │  │  ├─navigation_json
│  │  │  │  └─debug
│  │  │  ├─packaged_manifests
│  │  │  │  └─debug
│  │  │  ├─packaged_res
│  │  │  │  └─debug
│  │  │  │      ├─drawable
│  │  │  │      ├─drawable-v24
│  │  │  │      ├─layout
│  │  │  │      ├─menu
│  │  │  │      ├─mipmap-anydpi-v26
│  │  │  │      ├─mipmap-anydpi-v33
│  │  │  │      ├─mipmap-hdpi-v4
│  │  │  │      ├─mipmap-mdpi-v4
│  │  │  │      ├─mipmap-xhdpi-v4
│  │  │  │      ├─mipmap-xxhdpi-v4
│  │  │  │      ├─mipmap-xxxhdpi-v4
│  │  │  │      ├─navigation
│  │  │  │      ├─values
│  │  │  │      ├─values-night-v8
│  │  │  │      └─xml
│  │  │  ├─processed_res
│  │  │  │  └─debug
│  │  │  │      └─out
│  │  │  ├─project_dex_archive
│  │  │  │  └─debug
│  │  │  │      └─out
│  │  │  │          └─com
│  │  │  │              └─food1
│  │  │  │                  ├─bean
│  │  │  │                  ├─databinding
│  │  │  │                  ├─ui
│  │  │  │                  │  ├─dashboard
│  │  │  │                  │  ├─home
│  │  │  │                  │  ├─Mine
│  │  │  │                  │  └─notifications
│  │  │  │                  └─utils
│  │  │  ├─runtime_symbol_list
│  │  │  │  └─debug
│  │  │  ├─signing_config_versions
│  │  │  │  └─debug
│  │  │  ├─source_set_path_map
│  │  │  │  └─debug
│  │  │  ├─stable_resource_ids_file
│  │  │  │  └─debug
│  │  │  ├─sub_project_dex_archive
│  │  │  │  └─debug
│  │  │  │      └─out
│  │  │  ├─symbol_list_with_package_name
│  │  │  │  └─debug
│  │  │  ├─validate_signing_config
│  │  │  │  └─debug
│  │  │  └─variant_model
│  │  │      └─debug
│  │  ├─outputs
│  │  │  ├─apk
│  │  │  │  └─debug
│  │  │  └─logs
│  │  └─tmp
│  │      └─compileDebugJavaWithJavac
│  ├─libs
│  └─src
│      ├─androidTest
│      │  └─java
│      │      └─com
│      │          └─food1
│      ├─main
│      │  ├─java
│      │  │  └─com
│      │  │      └─food1
│      │  │          ├─bean
│      │      ├─values
│      │      │  └─dimen
│      │      ├─values-night
│      │      └─xml
│      └─test
│          └─java
│              └─com
│                  └─food1
└─gradle
    └─wrapper
 ```
