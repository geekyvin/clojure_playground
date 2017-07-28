;;http://stackoverflow.com/questions/43676782/clojure-call-a-function-over-and-over-using-the-result-as-an-argument
(defn add-and-multiply [x y z]
  (let [add (+ x y z)
        mult (* x y z)]
    [add mult]))


(add-and-multiply 2 3 4)


(defn function [x y z i]
  (let [add (+ x y z)
        mult (* x y z)
        n (inc i)]
    (println "n:" n)
    (println "Add:" add)
    (println "Multi:" mult)
    (if (> n 2) n (recur add mult mult n))))

(function 2 3 4 0)


(defn add-multiply [x y z]
    (loop [a x
           b y
           c z
           n 0]
      (if (> n 3)
        "Done!"
        (recur (+ a b c) (* a b c) (* a b c) (inc n)))))


(add-multiply 2 3 4)
