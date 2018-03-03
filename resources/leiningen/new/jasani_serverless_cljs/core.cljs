(ns {{name}}.core
    (:require [cljs-lambda.macros :refer-macros [defgateway]]))

(defgateway get [event ctx]
  (js/console.log "Invoked lambda function {{name}}.core/get")
  {:status 200
   :headers {:content-type "text/plain"}
   :body "Lambda function says 'Hello, World!'"})

(defn -main
  [& args]
  (println "Unused main"))
