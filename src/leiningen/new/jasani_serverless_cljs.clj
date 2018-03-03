(ns leiningen.new.jasani-serverless-cljs
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "jasani-serverless-cljs"))

(defn jasani-serverless-cljs
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' jasani-serverless-cljs project.")
    (->files data
             ["src/{{sanitized}}/foo.clj" (render "foo.clj" data)])))
