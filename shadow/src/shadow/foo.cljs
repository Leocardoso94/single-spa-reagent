(ns shadow.foo
  (:require
   [shadow.core :refer [init]]))

(defn promisify
  [f]
  (js/Promise. (fn [resolve]
                 (f)
                 (resolve))))

(defn ^:export bootstrap  [] (promisify #(js/console.log "bootstrap")))

(defn ^:export mount []
  (promisify init))

(defn ^:export unmount [] (promisify #(js/console.log "unmount3")))


(def generate-exports 
  #js {:mount mount
       :bootstrap bootstrap
       :unmount unmount})
