;; A script to build a ClojureScript "project."

(require 'cljs.build.api)

;; Build all .cljs files in the "src" directory writing the result to the
;; JavaScript file "out.main.js."
;;
;; Remember that the second argument to `build` is a map of options. In this
;; particular script, the only option specifies the file to which to output
;; the "compiled" JavaScript file.
(cljs.build.api/build "src" {:output-to "out/main.js"})
