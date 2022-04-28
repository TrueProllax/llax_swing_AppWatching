package llax.gui;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author 79996
 */
public class llaxFrame extends javax.swing.JFrame {

    /**
     * Creates new form llaxFrame
     */
    public llaxFrame() {
        initComponents();
        initLlax();
     
    }
    
    public void initLlax() {
        jTextArea4.setBackground(new Color(0,0,0,5));
        watchNextPanel.setBackground(new Color (0,44,71,200));
    }
    
    public void switchMovie(int idMovie) {
        switch (idMovie){
            case 1:
                jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(24,164,252)));
                jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
                jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
                jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
                labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/llax/image/back_godzilla.jpg")));
                
                
                // describe
                
                jLabel1.setText("GODZILLA");
                jLabel2.setText("kings of the monsters");
                jTextArea4.setText("This new story follows the heroic efforts of the crypto-zoological agency Monarch as its members face off against a battery of god-sized monsters, including the mighty Godzilla, who collides with Mothra, Rodan, and his ultimate nemesis, the three-headed monster King Ghidorah. "
                        + "When these ancient super-species thought to be mere myth rise again, they all vie for supremacy, leaving humanity's existence hanging in the balance");
                break;
            case 2:
                jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
                jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(24,164,252)));
                jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
                jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
                labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/llax/image/time.jpg")));
                
                // descibe 
                jLabel1.setText("TIME");
                jLabel2.setText("");
                jTextArea4.setText("In the future, science has stopped aging at 25. "
                        + "Everybody is allowed one more year. However there is the ability to transfer your time. "
                        + "Your life becomes currency and you work to earn time. "
                        + "In that way, society has divided into people who live day to day and people who are basically immortal");
                break;
            case 3:
                jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
                jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
                jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(24,164,252)));
                jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
                labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/llax/image/star_wars.jpg")));
                
                // descibe 
                jLabel1.setText("STAR WARS");
                jLabel2.setText("rise of skywalker");
                jTextArea4.setText("In the riveting conclusion of the landmark Skywalker saga, new legends will be born-and the final battle for freedom is yet to come");
                break;
                
            case 4:
                jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
                jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
                jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
                jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(24,164,252)));
                labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/llax/image/morbius.jpg")));
                
                // descibe 
                jLabel1.setText("Morbius");
                jLabel2.setText("");
                jTextArea4.setText("Biochemist Michael Morbius tries to cure himself of a rare blood disease, but he inadvertently infects himself with a form of vampirism instead");
                break;
        }
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        lineThree = new javax.swing.JPanel();
        lineTwo = new javax.swing.JPanel();
        lineOne = new javax.swing.JPanel();
        watchNextPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        describePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        myButton1 = new llax.swing.MyButton();
        labelDocumentaries2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelBell = new javax.swing.JLabel();
        labelSearch = new javax.swing.JLabel();
        labelDocumentaries1 = new javax.swing.JLabel();
        labelDocumentaries = new javax.swing.JLabel();
        labelTVshows = new javax.swing.JLabel();
        labelMovies = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 540));
        setUndecorated(true);

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lineThree.setBackground(new java.awt.Color(24, 164, 252));
        lineThree.setPreferredSize(new java.awt.Dimension(50, 20));

        javax.swing.GroupLayout lineThreeLayout = new javax.swing.GroupLayout(lineThree);
        lineThree.setLayout(lineThreeLayout);
        lineThreeLayout.setHorizontalGroup(
            lineThreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        lineThreeLayout.setVerticalGroup(
            lineThreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mainPanel.add(lineThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 40, 0));

        lineTwo.setBackground(new java.awt.Color(24, 164, 252));
        lineTwo.setPreferredSize(new java.awt.Dimension(50, 20));

        javax.swing.GroupLayout lineTwoLayout = new javax.swing.GroupLayout(lineTwo);
        lineTwo.setLayout(lineTwoLayout);
        lineTwoLayout.setHorizontalGroup(
            lineTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        lineTwoLayout.setVerticalGroup(
            lineTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mainPanel.add(lineTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 40, 0));

        lineOne.setBackground(new java.awt.Color(24, 164, 252));
        lineOne.setForeground(new java.awt.Color(255, 255, 255));
        lineOne.setInheritsPopupMenu(true);
        lineOne.setMinimumSize(new java.awt.Dimension(50, 20));
        lineOne.setPreferredSize(new java.awt.Dimension(50, 20));

        javax.swing.GroupLayout lineOneLayout = new javax.swing.GroupLayout(lineOne);
        lineOne.setLayout(lineOneLayout);
        lineOneLayout.setHorizontalGroup(
            lineOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        lineOneLayout.setVerticalGroup(
            lineOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mainPanel.add(lineOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 40, 5));

        watchNextPanel.setBackground(new java.awt.Color(0, 44, 71));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/llax/image/watchNext/back_godzilla.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/llax/image/watchNext/time.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/llax/image/watchNext/star_wars.jpg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/llax/image/watchNext/morbius.jpg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout watchNextPanelLayout = new javax.swing.GroupLayout(watchNextPanel);
        watchNextPanel.setLayout(watchNextPanelLayout);
        watchNextPanelLayout.setHorizontalGroup(
            watchNextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(watchNextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );
        watchNextPanelLayout.setVerticalGroup(
            watchNextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, watchNextPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(watchNextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        mainPanel.add(watchNextPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 407, 820, -1));

        describePanel.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("OCR-A BT", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GODZILLA");

        jLabel2.setFont(new java.awt.Font("OCR-A BT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("kings of the monsters");

        jScrollPane4.setBorder(null);
        jScrollPane4.setForeground(new java.awt.Color(255, 255, 255));

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("OCR-A BT", 0, 12)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setText("This new story follows the heroic efforts of the crypto-zoological agency Monarch as its members face off against a battery of god-sized monsters, including the mighty Godzilla, who collides with Mothra, Rodan, and his ultimate nemesis, the three-headed monster King Ghidorah. When these ancient super-species thought to be mere myth rise again, they all vie for supremacy, leaving humanity's existence hanging in the balance.");
        jTextArea4.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextArea4);

        myButton1.setBackground(new java.awt.Color(36, 163, 255));
        myButton1.setBorder(null);
        myButton1.setForeground(new java.awt.Color(255, 255, 255));
        myButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/llax/image/play.png"))); // NOI18N
        myButton1.setBorderColor(new java.awt.Color(255, 255, 255));
        myButton1.setBorderPainted(false);
        myButton1.setColor(new java.awt.Color(36, 163, 255));
        myButton1.setColorClick(new java.awt.Color(51, 204, 255));
        myButton1.setColorOver(new java.awt.Color(0, 102, 204));
        myButton1.setLabel("Watch New");
        myButton1.setRadius(20);

        javax.swing.GroupLayout describePanelLayout = new javax.swing.GroupLayout(describePanel);
        describePanel.setLayout(describePanelLayout);
        describePanelLayout.setHorizontalGroup(
            describePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(describePanelLayout.createSequentialGroup()
                .addGroup(describePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        describePanelLayout.setVerticalGroup(
            describePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(describePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(describePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 300, 320));

        labelDocumentaries2.setBackground(new java.awt.Color(51, 102, 255));
        labelDocumentaries2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelDocumentaries2.setForeground(new java.awt.Color(102, 153, 255));
        labelDocumentaries2.setText("LlaxMovie");
        labelDocumentaries2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDocumentaries2MouseClicked(evt);
            }
        });
        mainPanel.add(labelDocumentaries2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/llax/image/more_than.png"))); // NOI18N
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel5MouseMoved(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        mainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 440, 50, 60));

        labelBell.setBackground(new java.awt.Color(255, 255, 255));
        labelBell.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelBell.setForeground(new java.awt.Color(255, 255, 255));
        labelBell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/llax/image/search.png"))); // NOI18N
        labelBell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBellMouseClicked(evt);
            }
        });
        mainPanel.add(labelBell, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 30, 40));

        labelSearch.setBackground(new java.awt.Color(255, 255, 255));
        labelSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelSearch.setForeground(new java.awt.Color(255, 255, 255));
        labelSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/llax/image/bell.png"))); // NOI18N
        labelSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSearchMouseClicked(evt);
            }
        });
        mainPanel.add(labelSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 30, 40));

        labelDocumentaries1.setBackground(new java.awt.Color(255, 255, 255));
        labelDocumentaries1.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 18)); // NOI18N
        labelDocumentaries1.setForeground(new java.awt.Color(255, 255, 255));
        labelDocumentaries1.setText("Sign Up");
        labelDocumentaries1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDocumentaries1MouseClicked(evt);
            }
        });
        mainPanel.add(labelDocumentaries1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));

        labelDocumentaries.setBackground(new java.awt.Color(255, 255, 255));
        labelDocumentaries.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 18)); // NOI18N
        labelDocumentaries.setForeground(new java.awt.Color(255, 255, 255));
        labelDocumentaries.setText("Documentaries");
        labelDocumentaries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDocumentariesMouseClicked(evt);
            }
        });
        mainPanel.add(labelDocumentaries, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        labelTVshows.setBackground(new java.awt.Color(255, 255, 255));
        labelTVshows.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 18)); // NOI18N
        labelTVshows.setForeground(new java.awt.Color(255, 255, 255));
        labelTVshows.setText("TV shows");
        labelTVshows.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelTVshowsMouseClicked(evt);
            }
        });
        mainPanel.add(labelTVshows, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        labelMovies.setBackground(new java.awt.Color(255, 255, 255));
        labelMovies.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 18)); // NOI18N
        labelMovies.setForeground(new java.awt.Color(255, 255, 255));
        labelMovies.setText("Movies");
        labelMovies.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                labelMoviesMouseMoved(evt);
            }
        });
        labelMovies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMoviesMouseClicked(evt);
            }
        });
        mainPanel.add(labelMovies, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        labelLogo.setBackground(new java.awt.Color(153, 153, 255));
        labelLogo.setForeground(new java.awt.Color(255, 255, 255));
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/llax/image/back_godzilla.jpg"))); // NOI18N
        mainPanel.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelMoviesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMoviesMouseClicked
        // lines

        lineOne.setSize(40, 5);
        lineTwo.setSize(40,0);
        lineThree.setSize(40,0);
    }//GEN-LAST:event_labelMoviesMouseClicked

    private void labelTVshowsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTVshowsMouseClicked
        // lines
        
        lineOne.setSize(40, 0);
        lineTwo.setSize(40,5);
        lineThree.setSize(40,0);
    }//GEN-LAST:event_labelTVshowsMouseClicked

    private void labelDocumentariesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDocumentariesMouseClicked
        // lines
        
        lineOne.setSize(40,0);
        lineTwo.setSize(40,0);
        lineThree.setSize(40,5);
    }//GEN-LAST:event_labelDocumentariesMouseClicked

    private void labelMoviesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMoviesMouseMoved
        
    }//GEN-LAST:event_labelMoviesMouseMoved

    private void labelDocumentaries1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDocumentaries1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelDocumentaries1MouseClicked

    private void labelBellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBellMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelBellMouseClicked

    private void labelSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelSearchMouseClicked

    private void labelDocumentaries2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDocumentaries2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelDocumentaries2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        switchMovie(1);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        switchMovie(2);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseMoved
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/llax/image/more_than_fill.png")));
    }//GEN-LAST:event_jLabel5MouseMoved

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/llax/image/more_than.png")));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        switchMovie(3);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        switchMovie(4);
    }//GEN-LAST:event_jLabel7MouseClicked

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(llaxFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(llaxFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(llaxFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(llaxFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new llaxFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel describePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JLabel labelBell;
    private javax.swing.JLabel labelDocumentaries;
    private javax.swing.JLabel labelDocumentaries1;
    private javax.swing.JLabel labelDocumentaries2;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelMovies;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JLabel labelTVshows;
    private javax.swing.JPanel lineOne;
    private javax.swing.JPanel lineThree;
    private javax.swing.JPanel lineTwo;
    private javax.swing.JPanel mainPanel;
    private llax.swing.MyButton myButton1;
    private javax.swing.JPanel watchNextPanel;
    // End of variables declaration//GEN-END:variables
}
