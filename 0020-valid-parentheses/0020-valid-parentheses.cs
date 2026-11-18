// public class Solution {
//     public bool IsValid(string s) {
//         while (s.Contains("()") || s.Contains("[]") || s.Contains("{}"))
//         {
//             s = s.Replace("()", "").Replace("[]", "").Replace("{}", "");
//         }

//         return s.Length == 0;
//     }
// }


public class Solution {
    public bool IsValid(string s) {
		var stack = new Stack<char>();

		foreach (var c in s)
		{
			if (c is '(' or '{' or '[')
				stack.Push(c);

			if (c is not (')' or '}' or ']'))
				continue;

			if (!stack.TryPop(out var opening))
				return false;

			var isMatching = (opening, c) switch
			{
				('(', ')') => true,
				('[', ']') => true,
				('{', '}') => true,
				_ => false
			};

			if (!isMatching)
				return false;
		}

		return stack.Count == 0;
    }
}