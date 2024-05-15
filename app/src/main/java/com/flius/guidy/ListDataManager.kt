package com.flius.guidy

class ListDataManager {
    private val items = mutableListOf("때니", "빡기성", "민재몬", "이준상")
    fun getItems(): List<String> {
        return items
    }
}