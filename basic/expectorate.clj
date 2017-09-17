(ns expectorate
  (:import (java.io FileOutputStream OutputStreamWriter BufferedWriter)))

(defn make-writer [dst]
  (-> dst FileOutputStream. OutputStreamWriter. BufferedWriter.))

(defn expectorate [dst content]
  (with-open [writer (make-writer dst)]
      (.write writer (str content))))
(expectorate "dupa.txt" "dupa\n")
