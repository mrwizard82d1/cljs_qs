(ns hello-world.core
  (:require [cljs.nodejs :as nodejs]))

;; Print to the console using `println`.
(nodejs/enable-util-print!)

;; Node.js requires that we define a main function.
(defn -main [& args]
  (println "Hello QuickStart World on Node.js!"))

;; And "refer" to the main function from a well-known variable.
(set! *main-cli-fn* -main)

