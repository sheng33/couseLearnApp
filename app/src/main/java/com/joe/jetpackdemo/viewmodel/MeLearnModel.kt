package com.joe.jetpackdemo.viewmodel

import androidx.lifecycle.ViewModel
import com.joe.jetpackdemo.db.data.Course
import com.joe.jetpackdemo.db.data.Note
import java.util.ArrayList

class MeLearnModel : ViewModel() {
    val courseList: MutableList<Course> = ArrayList()
    init {
        courseList.add(Course("计算机科学与技术","本课程（“计算机科学导论”MOOC课程）是首批国家级线上一流课程，本课程将课程的结构建立在计算学科认知模型的基础上，并以计算机科学的内容为背景，借助大量案例，在学科思想与方法层面，对学生认知计算学科进行导引，着力提高学生在复杂问题求解，系统设计，以及人类行为理解方面的计算思维能力。\n","https://edu-image.nosdn.127.net/7A5D2D50370DE227BAF6E94747C51AF2.jpg","2020-05-21"))
        courseList.add(Course("人工智能：模型与算法","人工智能(Artificial Intelligence，简称AI)是以机器为载体所展示出来的人类智能，因此人工智能也被称为机器智能(Machine Intelligence)。对人类智能的模拟可通过以符号主义为核心的逻辑推理、以问题求解为核心的探询搜索、以数据驱动为核心的机器学习、以行为主义为核心的强化学习和以博弈对抗为核心的决策智能等方法来实现。","https://edu-image.nosdn.127.net/4944CEFB5E066C99DBBC366C362757CA.png","2020-05-21"))
        courseList.add(Course("程序设计入门——C语言","C语言是古老而长青的编程语言，它具备了现代程序设计的基础要求，它的语法是很多其他编程语言的基础，在系统程序、嵌入式系统等领域依然是无可替代的编程语言，在各类编程语言排行榜上常年占据前两名的位置。","https://img-ph-mirror.nosdn.127.net/tYhzuDVilzlDOo2bEyH_Qg==/6608226511143817333.jpg","2020-05-21"))
    }

}