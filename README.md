```
本小节笔者将带领大家认识和学习权限框架SpringSecurity，从入门->原理，
但仍有一定的局限性（扩展有不足，案例丰富度有欠缺）
理论学习预计2H，侧重于快速上手与原理了解。
```



# 读者定位

对于本章节的知识学习，读者们需要有

● 后端：SpringBoot、Spring、SpringMVC、MyBatis

● 数据库：MySQL

---

# 技术版本

● SpringBoot：2.1.8.RELEASE

● SpringSecurity：2.1.8.RELEASE

| **大类**          | **小节**                                                     | **时长&难度** |
| ----------------- | ------------------------------------------------------------ | ------------- |
| 01-认识权限管理   | [什么是权限管理](https://www.yuque.com/yzxb/index/azwkzvg1temvd7q2) | 3min-简单     |
|                   | [通用权限管理模型](https://www.yuque.com/yzxb/index/bo5dd6l0b298l3dq) | 10min-中等    |
|                   | [实现权限管理的技术](https://www.yuque.com/yzxb/index/uioe9926b36zn4ef) | 2min-简单     |
|                   | [认识SpringSecurity](https://www.yuque.com/yzxb/index/gsub30xgieyiw4q5) | 5min-中等     |
| 02-环境搭建及验证 | [工程搭建与验证](https://www.yuque.com/yzxb/index/pa4ru4epg8n4kzg5) | 10min-中等    |
| 03-认证原理分析   | [常用过滤器链介绍](https://www.yuque.com/yzxb/index/xfi9uc4u1vp4gu5p) | 5min-中等     |
|                   | [过滤器链加载原理](https://www.yuque.com/yzxb/index/ewlnipbdgknhs6n1) | 15min-难      |
| 04-自定义认证     | [自定义认证前端页面](https://www.yuque.com/yzxb/index/orieobues3qmcdne) | 10min-中等    |
|                   | [认证源码分析与自定义后端认证逻辑](https://www.yuque.com/yzxb/index/wkgpxuk4mlcouie2) | 20min-难      |
| 05-Remember Me    | [RememberMe简介及用法](https://www.yuque.com/yzxb/index/qc1u2wpxlazv9fbl) | 5min-中等     |
| 06-整合Oauth2.0   | [认识OAuth2.0](https://www.yuque.com/yzxb/index/ltqmp24i3aspaqn7) | 5min-简单     |
|                   | [OAuth2.0实战案例](https://www.yuque.com/yzxb/index/bcextgq0sktzd6op) | 30min-中等    |

---

# 源码获取

● https://github.com/Herbbbb/SpringSecurity.git

---

# 纠错勘误

● 如果读者在阅读笔记时发现错误可以及时留言评论，或在公众号：油炸小波，我将尽快进行修改。

---

# 转载声明

● 本文作品均为：油炸小波 原创，转载请声明引用地址，您的尊重与理解将是鞭策我前进的最大动力。

---
