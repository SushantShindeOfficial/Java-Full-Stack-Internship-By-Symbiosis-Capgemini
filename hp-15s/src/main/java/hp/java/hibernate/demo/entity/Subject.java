package hp.java.hibernate.demo.entity;

public class Subject {
	 private int subjectId;
	    private String name;
		private String author;
	    public Subject(int subjectId, String name, String author) {
			super();
			this.subjectId = subjectId;
			this.name = name;
			this.author = author;
		}
		
		public Subject() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Subject [subjectId=" + subjectId + ", name=" + name + ", author=" + author + "]";
		}
		public int getSubjectId() {
			return subjectId;
		}
		public void setSubjectId(int subjectId) {
			this.subjectId = subjectId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
	
}
