(ns hello-world.core
  (:require [clojure.browser.repl :as repl]))

;; Create the connection to the browser. By enclosing it in `defonce`, we ensure that we only construct the
;; connection once even if we reload the namespace during development.
(defonce conn
  (repl/connect "http://localhost:9000/repl"))

;; The following lines "redirect" calls to `println` to the browser console.
(enable-console-print!)
(println "Hello ClojureScript QuickStart!")

;; ADDED
(defn foo [a b]
  (+ a b))
