(ns com.uglyeagle.main
  (:gen-class))

(defn unmain [] ;; this has to appear earlier than main which I am also figuring out why this bullshit :gen-class
  (println "This is the unmain function."))

(defn -main
  "this is the main function that runs when the program starts."
  [& args]
  (println "Hello, World!")
  (unmain))