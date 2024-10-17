package com.example.test
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val client = HttpClient(CIO) // 使用 CIO 引擎
    val response: HttpResponse = client.get("https://jsonplaceholder.typicode.com/posts")
    println(response.bodyAsText()) // 打印响应内容
    client.close() // 关闭客户端
}