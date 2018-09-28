using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using System.Threading;

namespace Torres_de_hanoi
{
    public partial class Form1 : Form
    {
        bool Torres =false;
        Graphics g;
        int[] A;
        int[] B;
        int[] C;
        bool[] ban;
        int[] tope;
        int[] numElementos;
        int mov;
        public Form1()
        {
            
            ////////////////////////
            A = new int[4];
            for(int i=4,j=0;i>=1;i--,j++)
                A[j] = i;

            B = new int[4];
            C = new int[4];

            ban = new bool[3];
            tope = new int[3];
            tope[0] = 1;
            mov = 0;
            numElementos = new int[3];
            numElementos[0] = 4;
            //////////////////////

            InitializeComponent();
            g = panel1.CreateGraphics();
        }
      
        private void button4_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        
        private void panel1_MouseDown(object sender, MouseEventArgs e)
        {

            //Torre A
            if (e.X >= 0 && e.X <= 183)
                if (e.Y >= 75 && e.Y <= 264)
                    if(numElementos[0]>0)
                        ban[0] = true;
                
            //Torre B
            if (e.X >= 184 && e.X <= 378)
                if (e.Y >= 75 && e.Y <= 264)
                    if (numElementos[1] > 0)
                        ban[1] = true;
                
            //Torre C
            if (e.X >= 379 && e.X <= 593)
                if (e.Y >= 75 && e.Y <= 264)
                    if (numElementos[2] > 0)
                        ban[2] = true;

               
        }


        private void panel1_MouseMove(object sender, MouseEventArgs e)
        {
            for (int i = 0; i < 3; i++)
                if(ban[i])
                    this.Refresh();
            
            if (ban[0] && numElementos[0] > 0)
            {
                g.FillRectangle(new SolidBrush(Color.Black), 100 - ((A[numElementos[0] - 1]) * 13), 260 - (numElementos[0] - 1) * 10, 30 * A[numElementos[0] - 1], 10);
                int x = e.X;
                int y = e.Y;
                x -= (30 * A[numElementos[0] - 1]) /2;
                y -= 5;
                g.FillRectangle(new SolidBrush(Color.BlueViolet), x, y, 30 * A[numElementos[0] - 1], 10);
            }
            if (ban[1] && numElementos[1] > 0)
            {
                g.FillRectangle(new SolidBrush(Color.Black), 290 - ((B[numElementos[1] - 1]) * 13), 260 - (numElementos[1] - 1) * 10, 30 * B[numElementos[1] - 1], 10);
                int x = e.X;
                int y = e.Y;
                x -= (30 * B[numElementos[1] - 1]) / 2;
                y -= 5;
                g.FillRectangle(new SolidBrush(Color.BlueViolet), x, y, 30 * B[numElementos[1] - 1], 10);
            }

            if (ban[2] && numElementos[2] > 0)
            {
                g.FillRectangle(new SolidBrush(Color.Black), 460 - ((C[numElementos[2] - 1]) * 13), 260 - (numElementos[2] - 1) * 10, 30 * C[numElementos[2] - 1], 10);
                int x = e.X;
                int y = e.Y;
                x -= (30 * C[numElementos[2] - 1]) / 2;
                y -= 5;
                g.FillRectangle(new SolidBrush(Color.BlueViolet), x, y, 30 * C[numElementos[2] - 1], 10);
            }
         }

        private void panel1_MouseUp(object sender, MouseEventArgs e)
        {
                    //Torre A
                    if (e.X>=0 && e.X<=183)
                        if (e.Y>=75&&e.Y<=264)
                            if(!ban[0])
                                if(ban[1])
                                {
                                    if (tope[1] < tope[0] || tope[0] == 0)
                                    {
                                        tope[0] = tope[1];
                                        A[numElementos[0]] = tope[1];
                                        if (numElementos[1] > 1)
                                            tope[1] = B[numElementos[1] - 2];
                                        else
                                            tope[1] = B[numElementos[1]];
                                        
                                        B[numElementos[1] - 1] = 0;
                                        numElementos[1]--;
                                        numElementos[0]++;
                                        mov++;
                                    }
                                }
                                else if(ban[2])
                                {
                                    if (tope[2] < tope[0] || tope[0] == 0)
                                    {
                                        tope[0] = tope[2];
                                        A[numElementos[0]] = tope[2];
                                        if (numElementos[2] > 1)
                                            tope[2] = C[numElementos[2] - 2];
                                        else
                                            tope[2] = C[numElementos[2]];
                                        
                                        C[numElementos[2] - 1] = 0;
                                        numElementos[2]--;
                                        numElementos[0]++;
                                        mov++;
                                    }
                                }
                        
                    //Torre B
                    if (e.X >= 184 && e.X <= 378)
                        if (e.Y >= 75 && e.Y <= 264)
                            if (!ban[1])
                                if (ban[0])
                                {
                                    if (tope[0]<tope[1]||tope[1]==0)
                                    {
                                        tope[1] = tope[0];
                                        B[numElementos[1]] = tope[0];
                                        if (numElementos[0] > 1)
                                            tope[0] = A[numElementos[0] - 2];
                                        else
                                            tope[0] = A[numElementos[0]];
                                        
                                        A[numElementos[0] - 1] = 0;
                                        numElementos[0]--;
                                        numElementos[1]++;
                                        mov++;
                                    }
                                }
                                else if (ban[2])
                                {
                                    if (tope[2] < tope[1] || tope[1] == 0)
                                    {
                                        tope[1] = tope[2];
                                        B[numElementos[1]] = tope[2];
                                        if (numElementos[2] > 1)
                                            tope[2] = C[numElementos[2] - 2];
                                        else
                                            tope[2] = C[numElementos[2]];
                                       
                                        C[numElementos[2] - 1] = 0;
                                        numElementos[2]--;
                                        numElementos[1]++;
                                        mov++;
                                    }
                                }
                    //Torre C
                   if (e.X >= 379 && e.X <= 593)
                       if (e.Y >= 75 && e.Y <= 264)
                           if (!ban[2])
                               if (ban[0])
                               {
                                   if (tope[0] < tope[2] || tope[2] == 0)
                                   {
                                       tope[2] = tope[0];
                                       C[numElementos[2]] = tope[0];
                                       if (numElementos[0] > 1)
                                           tope[0] = A[numElementos[0] - 2];
                                       else
                                           tope[0] = A[numElementos[0]];
                                       
                                       A[numElementos[0] - 1] = 0;
                                       numElementos[0]--;
                                       numElementos[2]++;
                                       mov++;
                                   }
                               }
                               else if (ban[1])
                               {
                                   if (tope[1] < tope[2] || tope[2] == 0)
                                   {
                                       tope[2] = tope[1];
                                       C[numElementos[2]] = tope[1];
                                       if (numElementos[1] > 1)
                                           tope[1] = B[numElementos[1] - 2];
                                       else
                                           tope[1] = B[numElementos[1]];
                                       
                                       B[numElementos[1] - 1] = 0;
                                       numElementos[1]--;
                                       numElementos[2]++;
                                       mov++;
                                   }
                               }
                   for (int i = 0; i < 3; i++)
                       ban[i] = false;
                   this.Refresh();
                   int a = int.Parse(textBox1.Text);
                   if (C[a-1] == 1)
                   {
                       
                       label5.Text = "FELICIDADES LO CONSEGUISTE";
                   }
                   label6.Text = mov.ToString();
        }

        //Solucion 
        private void button2_Click(object sender, EventArgs e)
        {
            A = new int[4];
            B = new int[4];
            C = new int[4];
            Torres = true;
            //this.Refresh();
            A[3] = 1; B[3] = 0; C[3] = 0;
            A[2] = 2; B[2] = 0; C[2] = 0;
            A[1] = 3; B[1] = 0; C[1] = 0;
            A[0] = 4; B[0] = 0; C[0] = 0;
            this.Refresh();
            Thread.Sleep(1000);
            A[3] = 0; B[3] = 0; C[3] = 0;
            A[2] = 2; B[2] = 0; C[2] = 0;
            A[1] = 3; B[1] = 0; C[1] = 0;
            A[0] = 4; B[0] = 1; C[0] = 0;
            this.Refresh();
            Thread.Sleep(1000);
            A[3] = 0; B[3] = 0; C[3] = 0;
            A[2] = 0; B[2] = 0; C[2] = 0;
            A[1] = 3; B[1] = 0; C[1] = 0;
            A[0] = 4; B[0] = 1; C[0] = 2;
            this.Refresh();
            Thread.Sleep(1000);
            A[3] = 0; B[3] = 0; C[3] = 0;
            A[2] = 0; B[2] = 0; C[2] = 0;
            A[1] = 3; B[1] = 0; C[1] = 1;
            A[0] = 4; B[0] = 0; C[0] = 2;
            this.Refresh();
            Thread.Sleep(1000);
            A[3] = 0; B[3] = 0; C[3] = 0;
            A[2] = 0; B[2] = 0; C[2] = 0;
            A[1] = 0; B[1] = 0; C[1] = 1;
            A[0] = 4; B[0] = 3; C[0] = 2;
            this.Refresh();
            Thread.Sleep(1000);
            A[3] = 0; B[3] = 0; C[3] = 0;
            A[2] = 0; B[2] = 0; C[2] = 0;
            A[1] = 1; B[1] = 0; C[1] = 0;
            A[0] = 4; B[0] = 3; C[0] = 2;
            this.Refresh();
            Thread.Sleep(1000);
            A[3] = 0; B[3] = 0; C[3] = 0;
            A[2] = 0; B[2] = 0; C[2] = 0;
            A[1] = 1; B[1] = 2; C[1] = 0;
            A[0] = 4; B[0] = 3; C[0] = 0;
            this.Refresh();
            Thread.Sleep(1000);
            A[3] = 0; B[3] = 0; C[3] = 0;
            A[2] = 0; B[2] = 1; C[2] = 0;
            A[1] = 0; B[1] = 2; C[1] = 0;
            A[0] = 4; B[0] = 3; C[0] = 0;
            this.Refresh();
            
            Thread.Sleep(1000);
            A[3] = 0; B[3] = 0; C[3] = 0;
            A[2] = 0; B[2] = 1; C[2] = 0;
            A[1] = 0; B[1] = 2; C[1] = 0;
            A[0] = 0; B[0] = 3; C[0] = 4;
            this.Refresh();
            Thread.Sleep(1000);
            A[3] = 0; B[3] = 0; C[3] = 0;
            A[2] = 0; B[2] = 0; C[2] = 0;
            A[1] = 0; B[1] = 2; C[1] = 1;
            A[0] = 0; B[0] = 3; C[0] = 4;
            this.Refresh();
            Thread.Sleep(1000);
            A[3] = 0; B[3] = 0; C[3] = 0;
            A[2] = 0; B[2] = 0; C[2] = 0;
            A[1] = 0; B[1] = 0; C[1] = 1;
            A[0] = 2; B[0] = 3; C[0] = 4;
            this.Refresh();
            Thread.Sleep(1000);
            A[3] = 0; B[3] = 0; C[3] = 0;
            A[2] = 0; B[2] = 0; C[2] = 0;
            A[1] = 1; B[1] = 0; C[1] = 0;
            A[0] = 2; B[0] = 3; C[0] = 4;
            this.Refresh();
            Thread.Sleep(1000);
            A[3] = 0; B[3] = 0; C[3] = 0;
            A[2] = 0; B[2] = 0; C[2] = 0;
            A[1] = 1; B[1] = 0; C[1] = 3;
            A[0] = 2; B[0] = 0; C[0] = 4;
            this.Refresh();
            Thread.Sleep(1000);
            A[3] = 0; B[3] = 0; C[3] = 0;
            A[2] = 0; B[2] = 0; C[2] = 0;
            A[1] = 0; B[1] = 0; C[1] = 3;
            A[0] = 2; B[0] = 1; C[0] = 4;
            this.Refresh();
            Thread.Sleep(1000);
            A[3] = 0; B[3] = 0; C[3] = 0;
            A[2] = 0; B[2] = 0; C[2] = 2;
            A[1] = 0; B[1] = 0; C[1] = 3;
            A[0] = 0; B[0] = 1; C[0] = 4;
            this.Refresh();
            Thread.Sleep(1000);
            A[3] = 0; B[3] = 0; C[3] = 1;
            A[2] = 0; B[2] = 0; C[2] = 2;
            A[1] = 0; B[1] = 0; C[1] = 3;
            A[0] = 0; B[0] = 0; C[0] = 4;
            this.Refresh();
        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {
            if (Torres)
            {
                g.FillRectangle(new SolidBrush(Color.Black), 0, 0, 800, 800);
                g.FillRectangle(new SolidBrush(Color.White), 100, 70, 3, 200);
                g.FillRectangle(new SolidBrush(Color.White),290, 70, 3, 200);
                g.FillRectangle(new SolidBrush(Color.White),460 , 70, 3, 200);
                g.FillRectangle(new SolidBrush(Color.White), 60, 270, 90, 3);
                g.FillRectangle(new SolidBrush(Color.White), 250, 270, 90, 3);
                g.FillRectangle(new SolidBrush(Color.White), 420, 270, 90, 3);
                int a = int.Parse(textBox1.Text);
                for (int i = 0; i < a; i++)
                {
                    g.FillRectangle(new SolidBrush(Color.BlueViolet), 100  - (A[i] * 13), 260 - i * 10, 30 * A[i], 10); // Dibuja A
                    g.FillRectangle(new SolidBrush(Color.BlueViolet), 290 - (B[i] * 13), 260 - i * 10, 30 * B[i], 10); // Dibuja B
                    g.FillRectangle(new SolidBrush(Color.BlueViolet), 460 - (C[i] * 13), 260 - i * 10, 30 * C[i], 10); // Dibuja C
                }
            }
            
        }

        private void button5_Click(object sender, EventArgs e)
        {
            int a = int.Parse(textBox1.Text);
            A = new int[a];
            for (int i = a, j = 0; i >= 1; i--, j++)
                A[j] = i;

            B = new int[a];
            C = new int[a];
            label5.Text = "";
            ban = new bool[3];
            tope = new int[3];
            tope[0] = 1;
            mov = 0;
            label6.Text = mov.ToString();
            numElementos = new int[3];
            numElementos[0] = a;
            Torres = true;
            this.Refresh();
        }

       
    }
}