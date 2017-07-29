(defn max-counters [n A m]
    (loop [i 0
           C (vec (repeat n 0))]
      (if (= i n)
        C
        (recur
          (inc i)
          (assoc C
            (min m (nth A i))
            (inc (nth C i)))))))

(max-counters 7 [3 4 4 6 4 4 1] 5)

A[0] = 3
A[1] = 4
A[2] = 4
A[3] = 6
A[4] = 4
A[5] = 4
A[6] = 1
