(defproject {{name}} "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure       "1.9.0"]
                 [org.clojure/clojurescript "1.10.238"]
                 [io.nervous/cljs-lambda    "0.3.5"]]
  :plugins [[lein-npm                    "0.6.2"]
            [io.nervous/lein-cljs-lambda "0.6.6"]]
  :npm {:dependencies [[serverless-cljs-plugin "0.2.2"]]}
  :jvm-opts ["--add-modules" "java.xml.bind"]
  :cljs-lambda {:compiler
                {:inputs  ["src"]
                 :options {:output-to     "target/{{name}}/{{name}}.js"
                           :output-dir    "target/{{name}}"
                           :main          '{{name}}.core
                           :target        :nodejs
                           :optimizations :none}}})
