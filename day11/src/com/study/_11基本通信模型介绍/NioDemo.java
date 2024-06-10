package com.study._11基本通信模型介绍;

/**
 * @Classname: NioDemo
 * @Date: 2024/6/10 09:46
 * @Author: 聂建强
 * @Description:
 *     拓展：基本通信模型的概念介绍。
 *
 *      1.BIO通信模式：同步阻塞式通信。（Socket网络编程也就是上面的通信架构）
 *             -- 同步：当前线程要自己进行数据的读写操作。（自己去银行取钱）
 *             -- 异步: 当前线程可以去做其他事情，（委托一小弟拿银行卡到银行取钱，然后给你）
 *             -- 阻塞： 在数据没有的情况下，还是要继续等待着读。（排队等待）
 *             -- 非阻塞：在数据没有的情况下，会去做其他事情，一旦有了数据再来获取。（柜台取款，取个号，然后坐在椅子上做其它事，等号广播会通知你办理）
 *                 BIO表示同步阻塞式IO，服务器实现模式为一个连接一个线程，
 *                 即客户端有连接请求时服务器端就需要启动一个线程进行处理，
 *                 如果这个连接不做任何事情会造成不必要的线程开销，当然可以通过线程池机制改善。
 *                 同步阻塞式性能极差：大量线程，大量阻塞。
 *
 *     2.伪异步通信：引入了线程池。
 *             不需要一个客户端一个线程，可以实现1个线程复用来处理很多个客户端！
 *             这种架构，可以避免系统的死机，因为不会出现很多线程，线程可控。
 *             但是高并发下性能还是很差：a.线程数量少，数据依然是阻塞的。数据没有来线程还是要等待！
 *
 *     3.NIO表示同步非阻塞IO，服务器实现模式为请求对应一个线程，
 *         即客户端发送的连接请求都会注册到多路复用器上，
 *         多路复用器轮询到连接有I/O请求时才启动一个线程进行处理。
 *
 *          1个主线程专门负责接收客户端：
 *          1个线程[c1 ,s2 ,c3,c4, ,s2 ,c3,c4,,c3,c4, ,s2 ,c3,c4]轮询所有的客户端，发来了数据才会开启线程处理
 *          这种架构性能还可以！！
 *          同步：线程还是要不断的接收客户端连接，以及处理数据。
 *          非阻塞：如果一个管道没有数据，不需要等待，可以轮询下一个管道是否有数据！
 *
 *     4.AIO表示异步非阻塞IO，服务器实现模式为一个有效请求一个线程，
 *         客户端的I/O请求都是由操作系统先完成IO操作后再通知服务器应用来启动线程进行处理。
 *         异步：服务端线程接收到了客户端管道以后就交给底层处理它的io通信。
 *              自己可以做其他事情。
 *         非阻塞：底层也是客户端有数据才会处理，有了数据以后处理好通知服务器应用来启动线程进行处理。
 *
 *    小结：
 *        各种模型应用场景：
 *        BIO适用于连接数目比较小且固定的架构，该方式对服务器资源要求比较高，JDK 1.4以前的唯一选择。
 *        NIO适用于连接数目多且连接比较短（轻操作）的架构，如聊天服务器，编程复杂，
 *             JDK 1.4开始支持。
 *        AIO适用于连接数目多且连接比较长（重操作）的架构，如相册服务器，
 *             充分调用操作系统参与并发操作，编程复杂，JDK 1.7开始支持。
 */
public class NioDemo {
}
