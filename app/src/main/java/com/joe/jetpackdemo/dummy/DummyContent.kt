package com.joe.jetpackdemo.dummy

import java.util.*

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<DummyItem> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<Int, DummyItem> = HashMap()

    private val COUNT = 10

    init {
        // Add some sample items.
//        for (i in 1..COUNT) {
//            addItem(createDummyItem(i))
//        }
        addItem( DummyItem(1, "张三", "未签到",0))
        addItem( DummyItem(2, "李四", "已签到",1))
        addItem( DummyItem(3, "洪青", "未签到",0))
        addItem( DummyItem(10, "荷叶", "未签到",0))
        addItem( DummyItem(13, "洪湖", "已签到",1))
        addItem( DummyItem(15, "张三", "未签到",0))
        addItem( DummyItem(5, "何  海", "已签到",1))
        addItem( DummyItem(16, "李君", "已签到",1))
        addItem( DummyItem(19, "张国光", "已签到",1))
        addItem( DummyItem(6, "赵子瑞", "未签到",0))
        ITEMS.sortBy { it.id }
    }

    private fun addItem(item: DummyItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createDummyItem(position: Int): DummyItem {
        return DummyItem(position, "Item " + position, makeDetails(position),0)
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    /**
     * A dummy item representing a piece of content.
     */
    data class DummyItem(val id: Int, val name: String, val details: String,val status:Int) {
        override fun toString(): String = name
    }
}


