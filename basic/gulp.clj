(ns gulp
  (:import (java.io FileInputStream InputStreamReader BufferedReader)))

(defn make-reader [src]
  (-> src FileInputStream. InputStreamReader. BufferedReader.))

(defn gulp [src]
  (let [sb (StringBuilder.)]
    (with-open [reader (make-reader src)]
      (loop [c (.read reader)]
        (if (neg? c)
          (str sb)
          (do
            (.append sb (char c))
            (recur (.read reader))))))))

(println (gulp "./basic.clj"))
