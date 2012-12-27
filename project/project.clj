(defproject project "0.01"
  :description "Aleph testing"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [aleph "0.3.0-alpha2"]
                 [compojure "1.1.1"]
                 [ring "1.1.0-beta2"]
                 [hiccup "1.0.0-beta1"]
                 [lein-swank "1.4.4"]
                 [overtone "0.8.0-RC12"]]
  :source-path "src/clj"
  :aot [clj.core.main]
  :ring {:handler clj.core.main/-main}
  :main clj.core.main)
