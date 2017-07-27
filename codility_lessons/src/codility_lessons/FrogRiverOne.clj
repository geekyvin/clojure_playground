(use 'clojure.data)

(defn frog-river-one [A X]
  (let [A' [range 1 (inc X)]
        B []]
   (for [i (count A)]
     (conj B (nth A i)
      (if (= A B) i)))))

(nth [0 1 3] 2)

(for [x [0 1 2 3 4 5]
      :let [y (* x 3)]
      :when (even? y)]
  y)

(= '(1 2 3) (range 1 4))

(diff [1 2 3] [5 9 3 2 3 7])


(frog-river-one [3 1 4 2 3 5 4] 5)

  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
