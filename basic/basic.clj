(ns basic.basic
  (:require [clojure.string :as str])
  (:import (java.io File)))

(defn square-corners [bottom left size]
  (let [top (+ bottom size)
        right (+ left size)]
    [[bottom left] [top left] [bottom right] [top right]]))

(defn ellipsize [words]
  (let [[w1 w2 w3] (str/split words #"\s+")]
    (str/join " " [w1 w2 w3 "..."])))

(defn is-small? [number]
  (if (< number 100) :yes :no))
