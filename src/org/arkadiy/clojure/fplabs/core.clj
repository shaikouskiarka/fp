(ns org.arkadiy.clojure.fplabs.core
  (:gen-class)
  (:require [org.arkadiy.clojure.fplabs.clusterization.estimation :as estimation]
            [org.arkadiy.clojure.fplabs.crawling.crawler :as crawler]))

(defn -main
  [& args]
  (if-not (first args)
    (println "Pass lab number as command line argument")
    (case (first args)
      "1" (estimation/run-estimation (first (rest args)))
      "2" (crawler/crawl (rest args)))))