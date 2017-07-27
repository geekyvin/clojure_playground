(defn frog-jmp [X Y D]
  (let [distance (Math/abs (- X Y))]
  (Math/ceil (/ distance D))))

(frog-jmp 10 85 30)
