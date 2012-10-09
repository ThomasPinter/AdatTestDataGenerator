import java.io.*;



public class Output {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0; i<12;i++) {
		BufferedWriter bufferedWriter = null;
		//Generator g= new Generator();
		
		try {
			bufferedWriter = new BufferedWriter(new FileWriter("Test"+i+".txt"));
			
			for(int j=0; j<14300;j++) {
			Generator g= new Generator();
			bufferedWriter.write(g.toString());
			bufferedWriter.newLine();
			//System.out.println(g.toString());
			}
			
		} catch (FileNotFoundException ex) {
            ex.printStackTrace();
		}catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            
                    try {
						bufferedWriter.flush();
						bufferedWriter.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
                    


        }
		}
	}

}
