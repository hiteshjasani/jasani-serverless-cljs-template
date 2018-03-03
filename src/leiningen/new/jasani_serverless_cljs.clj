(ns leiningen.new.jasani-serverless-cljs
  (:require [leiningen.new.templates :refer [renderer raw-resourcer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "jasani-serverless-cljs"))
(def raw (raw-resourcer "jasani-serverless-cljs"))

(defn jasani-serverless-cljs
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' jasani-serverless-cljs project.")
    (->files data
             ["src/{{sanitized}}/core.cljs" (render "core.cljs" data)]
             ["project.clj" (render "project.clj" data)]
             ["serverless.yml" (render "serverless.yml" data)]
             )))
