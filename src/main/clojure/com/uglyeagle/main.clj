(ns com.uglyeagle.main
  (:gen-class))
  
(defn unmain []
  (println "This is the unmain function."))


(defn -main
  "this is the main function that runs when the program starts."
  [& args]
  (println "Hello, World!")
  (unmain))

