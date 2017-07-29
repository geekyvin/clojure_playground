(use 'clojure.data)

(defn frog-river-one [A X]
  (let [A' (range 0 (inc X))
        B []]
   (for [i A'
         :let [B (conj B (nth A i))]
         :when (= A' (sort B))]
        i)))

(nth [0 1 3] 2)

(for [x [0 1 2 3 4 5]
      :let [y (* x 3)]
      :when (even? y)]
  y)

(= '(1 2 3) (range 1 4))

(diff [1 2 3] [5 9 3 2 3 7])

(frog-river-one [3 1 4 2 3 5 4] 5)

(defn test_for [A]
  (let [B nil]
    (for [i A
          :let [B (conj B i)]
          :when (even? i)]
      B)))

(test_for [1 2 3 4])

(defn test_loop [A x]
  (let [A' (vec (range 0 (inc x)))]
    (loop [i 0
           B (conj [] (first A))]
          (if (or (= A' (sort B)) (< i 10))
            i
            (recur (inc i) (conj B A[i]))))))

(test_loop [3 1 4 2 3 5 4] 5)

()

()
