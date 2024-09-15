สอบวันอาทิตย์ รอบเช้า (15/9)
เลือกทำข้อที่ 2

โปรแกรมประกอบไปด้วยไฟล์ Java 8 ไฟล์ได้แก่
ส่วนของ Model
1. Cow.java : เป็น model สำหรับเก็บข้อมูลวัวและเป็น Super class ของวัวชนิดต่าง ๆ
2. BlackCow.java : เป็น model Sub class เก็บข้อมูลวัวดำ
3. BrownCow.java : เป็น model Sub class เก็บข้อมูลวัวน้ำตาล
4. WhiteCow.java : เป็น model Sub class เก็บข้อมูลวัวขาว
5. BowlingFrame.java : model ใช้ในการเล่นโบว์ลิง 1 รอบ

ส่วนของ View
1. BowlingView.java : จัดการส่วนของการแสดงผลเกมโบว์ลิง

ส่วนของ Controller
1. BowlingController.java : เป็น Controller จัดการกติกาของเกม

และ Main.java ใช้เริ่มโปรแกรม

หลักการทำงานเมื่อเริ่มโปรแกรม :
- โปรแกรมจะสร้าง Cow 3 ชนิดคือ WhiteCow, BlackCow, BrownCow ขึ้นมาแล้วเรียงลำดับการเล่นด้วยตัวแปร cows 
- จากนั้น Controller จะสั่ง StartGame วัวจะเล่นโบว์ลิงตามลำดับที่เรียงเอาไว้โดยวัวแต่ละตัวจะมี BowlingFrame ของตัวเอง 10 Object ตามกติกา ซึ่งวัวแต่ละตัวจะใช้คำสั่ง playFrame() ของตนเองในการเล่น 1 รอบโดยจะมีการเช็ควัวที่พูดโกหกอยู่ใน method นี้ด้วย และมีการแสดงผลคะแนนในแต่ละรอบด้วย displayThrowResult()  ที่อยู่ใน BowlingView
- เมื่อเล่นครบ 10 รอบทุกตัวแล้วจะคำนวณคะแนนด้วย calculateTotalScore() ใน Cow และแสดงผลโดย displayScore ที่อยู่ใน BowlingView 
- สุดท้าย Controller จะหาผู้ชนะโดยการใช้ findWinner() แล้วส่งไปยังหน้าจอด้วย displayWinner() ที่อยู่ใน BowlingView
