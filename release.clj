(require 'cljs.build.api)

;; Create a build process that compiles all files in the directory "src" and generates a single file, "out/main.js," 
;; containing JavaScript generated using advanced optimizations.
;;
;; When compiling with advanced options, because the compiler produces a single file, we **do not** need to specify the 
;;`:main` option to identify the module containing the main function.
(cljs.build.api/build "src"
                      {:output-to "out/main.js"
                       :optimizations :advanced})

;; Because the Google Closure compiler creates a thread pool that isn't shutdown, we explicitly exit in order to 
;; kill the process.
(System/exit 0)
