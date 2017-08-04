(defn prefix-sum [A]
  (loop [i 1
         C (vector (first A))]
       (if (< i (count A))
        (recur (inc i) (conj C (+ (nth A i) (last C))))
        C)))

(prefix-sum [2 3 7 5 1 3 9])

(prefix-sum [0 1 0 1 1])

;; Don't why I need prefix-sum :P
(defn passing-cars [A]
  (loop [i 0
         c 0
         p 0]
       (if (= i (count A))
         p
        (if (= 1 (nth A i))
          (recur (inc i) c (+ c p))
          (recur (inc i) (inc c) p)))))

(passing-cars [0 1 0 1 1])
