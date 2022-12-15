# sort-algorithm

冒泡排序、选择排序、插入排序、希尔排序、快速排序算法的Java实现。

讲解见：[常见排序算法的原理及Java实现](https://www.eula.club/blogs/%E5%B8%B8%E8%A7%81%E6%8E%92%E5%BA%8F%E7%AE%97%E6%B3%95%E7%9A%84%E5%8E%9F%E7%90%86%E5%8F%8AJava%E5%AE%9E%E7%8E%B0.html)

通过测试类，研究排序算法的时间复杂度。

eg：当随机数组的数量级达到100000时的一次排序算法执行耗时。

````
========== 随机乱序 ==========
1.【冒泡排序】排序耗用了20525毫秒
2.【选择排序】排序耗用了5565毫秒
3.【插入排序】排序耗用了1044毫秒
4.【希尔排序】排序耗用了19毫秒
5.【快速排序】排序耗用了11毫秒
========== 近乎顺序 ==========
1.【冒泡排序】排序耗用了9732毫秒
2.【选择排序】排序耗用了5551毫秒
3.【插入排序】排序耗用了6毫秒
4.【希尔排序】排序耗用了6毫秒
5.【快速排序】排序耗用了51毫秒
````

