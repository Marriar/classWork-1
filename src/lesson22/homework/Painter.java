package lesson22.homework;

import lesson20.Point;

// TODO ����� � ������� ������� ���������� ������� ��������� ��������
// TODO ������� ��������� ���������� ������� ����������, 
// �.�. ��� ������� ���������� ����� ������ ������� �� ����� ����� �� ����� ... � ����� ... 
public interface Painter {
	// ������ ��� ��������� �����
	void drawline(Point from, Point to);
	default void clear() {
		System.out.println("Do nothing");
	}
}
