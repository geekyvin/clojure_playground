(defn max-counters [n A m]
    (loop [i 0
           C (vec (repeat n 0))]
      (if (= i n)
        C
        (recur
          (inc i)
          (assoc C
            (nth A i)
            (min n (inc (nth C (nth A i)))))))))

(max-counters 7 [3 4 4 6 4 4 1] 5)
