(defn prefix-sum [A]
  (loop [i 1
         C (vector (first A))]
       (if (< i (count A))
        (recur (inc i) (conj C (+ (nth A i) (last C))))
        C)))

(prefix-sum [4 2 2 5 1 5 8])


(defn min-avg-two-slice [A n]
  (let [prefix-sum-local (prefix-sum A) ;; O(N)
        avg-sum (/ (last prefix-sum-local) (count A))
        A' (vector (partition 2 1 A))]
    (loop [i 0
           m -1 ;; min-sum-index
           iavg-sum avg-sum]
      (if (= i 4)
        m
        (if (< (/ (reduce + (nth A' i)) 2) iavg-sum)
          (recur (inc i) i (/ (nth A' i) 2))
          (recur (inc i) m iavg-sum))))))


(min-avg-two-slice [4 2 2 5 1 5 8] 7)
