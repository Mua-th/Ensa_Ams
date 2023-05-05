package org.eclipse.wb.swing;

import javax.swing.JPanel;
import javax.swing.JTextField;

import CLASSES.Admin;
import CLASSES.Etudiant;
import CLASSES.Prof;
import testgraphic.newpwd;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InfoPnl extends JPanel {

	/**
	 * Create the panel.
	 */
	public InfoPnl(final Prof current) {
		setBackground(new Color(208, 233, 242));
		setPreferredSize(new Dimension(754, 424));
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 50));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(208, 233, 242));
		panel.setPreferredSize(new Dimension(200, 324));
		add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel("CODE_PROF");
		lblNewLabel.setForeground(new Color(47, 85, 115));
		lblNewLabel.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" ");
		panel.add(lblNewLabel_1);
		
		JLabel lblCne = new JLabel("CNE");
		lblCne.setForeground(new Color(47, 85, 115));
		lblCne.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblCne);
		
		JLabel lblNewLabel_1_1 = new JLabel(" ");
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNom = new JLabel("NOM");
		lblNom.setForeground(new Color(47, 85, 115));
		lblNom.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblNom);
		
		JLabel lblNewLabel_1_1_1 = new JLabel(" ");
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblPrenom = new JLabel("PRENOM");
		lblPrenom.setForeground(new Color(47, 85, 115));
		lblPrenom.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblPrenom);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel(" ");
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblTel = new JLabel("TEL");
		lblTel.setForeground(new Color(47, 85, 115));
		lblTel.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblTel);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel(" ");
		panel.add(lblNewLabel_1_1_1_2);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(new Color(47, 85, 115));
		lblPassword.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblPassword);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel(" ");
		panel.add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblStatut = new JLabel("STATUT");
		lblStatut.setForeground(new Color(47, 85, 115));
		lblStatut.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblStatut);
		
		JLabel lblNewLabel_1_1_1_2_1_1 = new JLabel(" ");
		panel.add(lblNewLabel_1_1_1_2_1_1);
		
		JLabel lblSalaire = new JLabel("SALAIRE");
		lblSalaire.setForeground(new Color(47, 85, 115));
		lblSalaire.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblSalaire);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1 = new JLabel(" ");
		panel.add(lblNewLabel_1_1_1_2_1_1_1);
		
		JLabel lblDepartement = new JLabel("DEPARTEMENT");
		lblDepartement.setForeground(new Color(47, 85, 115));
		lblDepartement.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblDepartement);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(208, 233, 242));
		panel_1.setPreferredSize(new Dimension(200, 324));
		add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JLabel codeprf = new JLabel(Integer.toString(current.getCode_prof()));
		codeprf.setForeground(new Color(47, 85, 115));
		codeprf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(codeprf);
		
		JLabel lblNewLabel_1_2 = new JLabel(" ");
		panel_1.add(lblNewLabel_1_2);
		
		JLabel cneprf = new JLabel( current.getCne());
		cneprf.setForeground(new Color(47, 85, 115));
		cneprf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(cneprf);
		
		JLabel lblNewLabel_1_2_1 = new JLabel(" ");
		panel_1.add(lblNewLabel_1_2_1);
		
		JLabel nom_prf = new JLabel(current.getNom());
		nom_prf.setForeground(new Color(47, 85, 115));
		nom_prf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(nom_prf);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel(" ");
		panel_1.add(lblNewLabel_1_2_1_1);
		
		JLabel prnprf = new JLabel(current.getPrenom());
		prnprf.setForeground(new Color(47, 85, 115));
		prnprf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(prnprf);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel(" ");
		panel_1.add(lblNewLabel_1_2_1_1_1);
		
		JLabel telprf = new JLabel(Integer.toString(current.getTel()));
		telprf.setForeground(new Color(47, 85, 115));
		telprf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(telprf);
		
		JLabel lblNewLabel_1_2_1_1_1_1 = new JLabel(" ");
		panel_1.add(lblNewLabel_1_2_1_1_1_1);
		
		
		final JLabel pwdprf = new JLabel(current.getPwd());
		pwdprf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pwdprf.setForeground(new Color(255,255,255));
				pwdprf.setBackground(new Color(86,135,166));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pwdprf.setForeground(new Color(47, 85, 115));
				pwdprf.setBackground(new Color(208,233,242));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				removeAll();
				setVisible(false);
				add(new newpwd(current));
				setVisible(true);
			
				
				
			}
		});
		pwdprf.setForeground(new Color(47, 85, 115));
		pwdprf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(pwdprf);
		
		JLabel lblNewLabel_1_2_1_1_1_2 = new JLabel(" ");
		panel_1.add(lblNewLabel_1_2_1_1_1_2);
		
		JLabel statutprf = new JLabel(current.getStatut());
		statutprf.setForeground(new Color(47, 85, 115));
		statutprf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(statutprf);
		
		JLabel lblNewLabel_1_2_1_1_1_2_1 = new JLabel(" ");
		panel_1.add(lblNewLabel_1_2_1_1_1_2_1);
		
		JLabel salaire = new JLabel(Float.toString(current.getSalaire()));
		salaire.setForeground(new Color(47, 85, 115));
		salaire.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(salaire);
		
		JLabel lblNewLabel_1_2_1_1_1_2_1_1 = new JLabel(" ");
		panel_1.add(lblNewLabel_1_2_1_1_1_2_1_1);
		
		JLabel depart = new JLabel(current.getNom_dep());
		depart.setForeground(new Color(47, 85, 115));
		depart.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(depart);

	}

	public InfoPnl(final Admin current) {

		setBackground(new Color(208, 233, 242));
		setPreferredSize(new Dimension(754, 424));
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 50));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(208, 233, 242));
		panel.setPreferredSize(new Dimension(200, 324));
		add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel("CODE_PROF");
		lblNewLabel.setForeground(new Color(47, 85, 115));
		lblNewLabel.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" ");
		panel.add(lblNewLabel_1);
		
		JLabel lblCne = new JLabel("CNE");
		lblCne.setForeground(new Color(47, 85, 115));
		lblCne.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblCne);
		
		JLabel lblNewLabel_1_1 = new JLabel(" ");
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNom = new JLabel("NOM");
		lblNom.setForeground(new Color(47, 85, 115));
		lblNom.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblNom);
		
		JLabel lblNewLabel_1_1_1 = new JLabel(" ");
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblPrenom = new JLabel("PRENOM");
		lblPrenom.setForeground(new Color(47, 85, 115));
		lblPrenom.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblPrenom);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel(" ");
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblTel = new JLabel("TEL");
		lblTel.setForeground(new Color(47, 85, 115));
		lblTel.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblTel);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel(" ");
		panel.add(lblNewLabel_1_1_1_2);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(new Color(47, 85, 115));
		lblPassword.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblPassword);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel(" ");
		panel.add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblStatut = new JLabel("FILIERE");
		lblStatut.setForeground(new Color(47, 85, 115));
		lblStatut.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblStatut);
		
	
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(208, 233, 242));
		panel_1.setPreferredSize(new Dimension(200, 324));
		add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JLabel codeprf = new JLabel(current.getCode_ad());
		codeprf.setForeground(new Color(47, 85, 115));
		codeprf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(codeprf);
		
		JLabel lblNewLabel_1_2 = new JLabel(" ");
		panel_1.add(lblNewLabel_1_2);
		
		JLabel cneprf = new JLabel( current.getCne());
		cneprf.setForeground(new Color(47, 85, 115));
		cneprf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(cneprf);
		
		JLabel lblNewLabel_1_2_1 = new JLabel(" ");
		panel_1.add(lblNewLabel_1_2_1);
		
		JLabel nom_prf = new JLabel(current.getNom());
		nom_prf.setForeground(new Color(47, 85, 115));
		nom_prf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(nom_prf);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel(" ");
		panel_1.add(lblNewLabel_1_2_1_1);
		
		JLabel prnprf = new JLabel(current.getPrenom());
		prnprf.setForeground(new Color(47, 85, 115));
		prnprf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(prnprf);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel(" ");
		panel_1.add(lblNewLabel_1_2_1_1_1);
		
		JLabel telprf = new JLabel(Integer.toString(current.getTel()));
		telprf.setForeground(new Color(47, 85, 115));
		telprf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(telprf);
		
		JLabel lblNewLabel_1_2_1_1_1_1 = new JLabel(" ");
		panel_1.add(lblNewLabel_1_2_1_1_1_1);
		
		
		final JLabel pwdprf = new JLabel(current.getPwd());
		pwdprf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pwdprf.setForeground(new Color(255,255,255));
				pwdprf.setBackground(new Color(86,135,166));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pwdprf.setForeground(new Color(47, 85, 115));
				pwdprf.setBackground(new Color(208,233,242));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				removeAll();
				setVisible(false);
				add(new newpwd(current));
				setVisible(true);
			
				
				
			}
		});
		pwdprf.setForeground(new Color(47, 85, 115));
		pwdprf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(pwdprf);
		
		JLabel lblNewLabel_1_2_1_1_1_2 = new JLabel(" ");
		panel_1.add(lblNewLabel_1_2_1_1_1_2);
		
		JLabel statutprf = new JLabel(current.getNom_fil());
		statutprf.setForeground(new Color(47, 85, 115));
		statutprf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(statutprf);
		
	
		
	}
	
	public InfoPnl(final Etudiant current) {
		setBackground(new Color(208, 233, 242));
		setPreferredSize(new Dimension(754, 424));
		setLayout(new FlowLayout(FlowLayout.LEFT, 100, 50));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(208, 233, 242));
		panel.setPreferredSize(new Dimension(200, 324));
		add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel("APPOGEE");
		lblNewLabel.setForeground(new Color(47, 85, 115));
		lblNewLabel.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" ");
		panel.add(lblNewLabel_1);
		
		JLabel lblCne = new JLabel("CNE");
		lblCne.setForeground(new Color(47, 85, 115));
		lblCne.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblCne);
		
		JLabel lblNewLabel_1_1 = new JLabel(" ");
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNom = new JLabel("NOM");
		lblNom.setForeground(new Color(47, 85, 115));
		lblNom.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblNom);
		
		JLabel lblNewLabel_1_1_1 = new JLabel(" ");
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblPrenom = new JLabel("PRENOM");
		lblPrenom.setForeground(new Color(47, 85, 115));
		lblPrenom.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblPrenom);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel(" ");
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblTel = new JLabel("TEL");
		lblTel.setForeground(new Color(47, 85, 115));
		lblTel.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblTel);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel(" ");
		panel.add(lblNewLabel_1_1_1_2);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(new Color(47, 85, 115));
		lblPassword.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblPassword);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel(" ");
		panel.add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblStatut = new JLabel("CLASSE");
		lblStatut.setForeground(new Color(47, 85, 115));
		lblStatut.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblStatut);
		
	
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(208, 233, 242));
		panel_1.setPreferredSize(new Dimension(200, 324));
		add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JLabel codeprf = new JLabel(Integer.toString(current.getAppogee()));
		codeprf.setForeground(new Color(47, 85, 115));
		codeprf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(codeprf);
		
		JLabel lblNewLabel_1_2 = new JLabel(" ");
		panel_1.add(lblNewLabel_1_2);
		
		JLabel cneprf = new JLabel( current.getCne());
		cneprf.setForeground(new Color(47, 85, 115));
		cneprf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(cneprf);
		
		JLabel lblNewLabel_1_2_1 = new JLabel(" ");
		panel_1.add(lblNewLabel_1_2_1);
		
		JLabel nom_prf = new JLabel(current.getNom());
		nom_prf.setForeground(new Color(47, 85, 115));
		nom_prf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(nom_prf);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel(" ");
		panel_1.add(lblNewLabel_1_2_1_1);
		
		JLabel prnprf = new JLabel(current.getPrenom());
		prnprf.setForeground(new Color(47, 85, 115));
		prnprf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(prnprf);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel(" ");
		panel_1.add(lblNewLabel_1_2_1_1_1);
		
		JLabel telprf = new JLabel(Integer.toString(current.getTel()));
		telprf.setForeground(new Color(47, 85, 115));
		telprf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(telprf);
		
		JLabel lblNewLabel_1_2_1_1_1_1 = new JLabel(" ");
		panel_1.add(lblNewLabel_1_2_1_1_1_1);
		
		
		final JLabel pwdprf = new JLabel(current.getPwd());
		pwdprf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pwdprf.setForeground(new Color(255,255,255));
				pwdprf.setBackground(new Color(86,135,166));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pwdprf.setForeground(new Color(47, 85, 115));
				pwdprf.setBackground(new Color(208,233,242));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				removeAll();
				setVisible(false);
				add(new newpwd(current));
				setVisible(true);
			
				
				
			}
		});
		pwdprf.setForeground(new Color(47, 85, 115));
		pwdprf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(pwdprf);
		
		JLabel lblNewLabel_1_2_1_1_1_2 = new JLabel(" ");
		panel_1.add(lblNewLabel_1_2_1_1_1_2);
		
		JLabel statutprf = new JLabel(current.getNom_cl());
		statutprf.setForeground(new Color(47, 85, 115));
		statutprf.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel_1.add(statutprf);
		
	
		
	}

}
