;; A script to build a ClojureScript "project."

(require 'cljs.build.api)

;; Build all .cljs files in the "src" directory writing the result to the
;; JavaScript file "out.main.js."
;;
;; The second argument to `build` is a map of options. The `:main` option
;; tells the compiler the function to automatically invoke. The `:output-to`
;; option specifies the destination for the compiled file.
(cljs.build.api/build "src"
  {:main 'hello-world.core
   :output-to "out/main.js"})
